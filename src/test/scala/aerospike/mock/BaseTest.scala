package aerospike.mock

import com.aerospike.client.async.IAsyncClient
import com.aerospike.client.{Bin, Key}
import com.aerospike.client.policy.WritePolicy
import org.scalatest.{FlatSpec, Matchers}

/**
  * @author MarinaSigaeva 
  * @since 13.11.16
  */
class BaseTest extends FlatSpec with Matchers {

  case class Service(client: IAsyncClient) {
    def addSmth(policy: WritePolicy, key: Key, bins: Bin*) =
      client.add(policy, key, bins:_*)
  }

  trait mocks {
    val mockAerospike = new MockAerospike {
      override def add(policy: WritePolicy, key: Key, bins: Bin*): Unit = println("")
    }

    val service = Service(mockAerospike)
    val wp = new WritePolicy()
    val key = new Key("ns", "sn", "kValue")
    val bs = Seq(new Bin("name", "bValue"))
  }

  "MyService" should "call method addSmth" in new mocks {
    service.addSmth(wp, key, bs:_*) shouldBe {}
  }
}
