# AerospikeClient Mock

How to get 
```scala
"com.github.danymarialee" %% "aerospike-mock" % "1.0.4"
 ```

Mock class has all methods with result types. Implemented like so:
```scala
def method(parameters: ..) = ???
```

You can use it for tests, here is how:
 ```scala
import com.aerospike.client.async.IAsyncClient
import com.aerospike.client.{Bin, Key}
import com.aerospike.client.policy.WritePolicy
import org.scalatest.{FlatSpec, Matchers}

class BaseTest extends FlatSpec with Matchers {

  case class Service(client: IAsyncClient) {
    def addSmth(policy: WritePolicy, key: Key, bins: Bin*) =
      client.add(policy, key, bins:_*)
  }

  trait mocks {
    val mockAerospike = new MockAerospike {
      override def add(policy: WritePolicy, key: Key, bins: Bin*): Unit = println("Call Add method")
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
```


