/*
 * Copyright (c) 2016 Dany Lee
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

                        package aerospike.mock

import java.util.concurrent.{BlockingQueue, DelayQueue}
import com.aerospike.client.Value.StringValue
import com.aerospike.client._
import com.aerospike.client.admin.{Privilege, Role, User}
import com.aerospike.client.async.IAsyncClient
import com.aerospike.client.cluster.{Cluster, Node}
import com.aerospike.client.large.{LargeList, LargeMap, LargeSet, LargeStack}
import com.aerospike.client.listener._
import com.aerospike.client.policy._
import com.aerospike.client.query._
import com.aerospike.client.task.{ExecuteTask, IndexTask, RegisterTask}

import scala.collection.JavaConversions._

/**
  * @author MarinaSigaeva
  * @since 08.09.16
  */
class MockAerospike extends IAsyncClient {

  def getAsyncReadPolicyDefault: Policy = ???

  def getReadPolicyDefault: Policy = ???

  def getAsyncWritePolicyDefault: WritePolicy = ???

  def getAsyncScanPolicyDefault: ScanPolicy = ???

  def getAsyncQueryPolicyDefault: QueryPolicy = ???

  def getAsyncBatchPolicyDefault: BatchPolicy = ???

  def getInfoPolicyDefault: InfoPolicy = ???

  def getWritePolicyDefault: WritePolicy = ???

  def getBatchPolicyDefault: BatchPolicy = ???

  def getQueryPolicyDefault: QueryPolicy = ???

  def getScanPolicyDefault: ScanPolicy = ???

  def isConnected: Boolean = ???

  def close(): Unit = ???

  def getNodeNames: java.util.List[String] = ???

  def getNodes: Array[Node] = ???

  def getNode(nodeName: String): Node = ???

  def scanNode(policy: ScanPolicy, nodeName: String, namespace: String, setName: String, callback: ScanCallback, binNames: String*): Unit = ???

  def scanNode(policy: ScanPolicy, node: Node, namespace: String, setName: String, callback: ScanCallback, binNames: String*): Unit = ???

  def get(policy: BatchPolicy, keys: Array[Key]): Array[Record] = ???

  def get(policy: BatchPolicy, records: java.util.List[BatchRead]): Unit = ???

  def get(policy: BatchPolicy, keys: Array[Key], binNames: String*): Record = ???

  def prepend(policy: WritePolicy, key: Key, bins: Bin*): Unit = ???

  def put(policy: WritePolicy, key: Key, bins: Bin*): Unit = ???

  def append(policy: WritePolicy, key: Key, bins: Bin*): Unit = ???

  def get(policy: Policy, key: Key, binNames: String*): Record = ???

  def get(policy: Policy, key: Key): Record = ???

  def put(policy: WritePolicy, listener: WriteListener, key: Key, bins: Bin*): Unit = ???

  def append(policy: WritePolicy, listener: WriteListener, key: Key, bins: Bin*): Unit = ???

  def prepend(policy: WritePolicy, listener: WriteListener, key: Key, bins: Bin*): Unit = ???

  def add(policy: WritePolicy, listener: WriteListener, key: Key, bins: Bin*): Unit = ???

  def add(policy: WritePolicy, key: Key, bins: Bin*): Unit = ???

  def delete(policy: WritePolicy, listener: DeleteListener, key: Key): Unit = ???

  def touch(policy: WritePolicy, listener: WriteListener, key: Key): Unit = ???

  def touch(policy: WritePolicy, key: Key): Unit = ???

  def delete(policy: WritePolicy, key: Key): Boolean = ???

  def exists(policy: Policy, listener: ExistsListener, key: Key): Unit = ???

  def exists(policy: Policy, key: Key): Boolean = ???

  def exists(policy: BatchPolicy, listener: ExistsArrayListener, keys: Array[Key]): Unit = ???

  def exists(policy: BatchPolicy, listener: ExistsSequenceListener, keys: Array[Key]): Unit = ???

  def exists(policy: BatchPolicy, keys: Array[Key]): Array[Boolean] = ???

  def get(policy: Policy, listener: RecordListener, key: Key): Unit = ???

  def get(policy: Policy, listener: RecordListener, key: Key, binNames: String*): Unit = ???

  def getHeader(policy: Policy, listener: RecordListener, key: Key): Unit = ???

  def getHeader(policy: Policy, key: Key): Record = ???

  def get(policy: BatchPolicy, listener: BatchListListener, records: java.util.List[BatchRead]): Unit = ???

  def get(policy: BatchPolicy, listener: BatchSequenceListener, records: java.util.List[BatchRead]): Unit = ???

  def get(policy: BatchPolicy, listener: RecordArrayListener, keys: Array[Key]): Unit = ???

  def get(policy: BatchPolicy, listener: RecordSequenceListener, keys: Array[Key]): Unit = ???

  def get(policy: BatchPolicy, listener: RecordArrayListener, keys: Array[Key], binNames: String*): Unit = ???

  def get(policy: BatchPolicy, listener: RecordSequenceListener, keys: Array[Key], binNames: String*): Unit = ???

  def getHeader(policy: BatchPolicy, listener: RecordArrayListener, keys: Array[Key]): Unit = ???

  def getHeader(policy: BatchPolicy, listener: RecordSequenceListener, keys: Array[Key]): Unit = ???

  def getHeader(policy: BatchPolicy, keys: Array[Key]): Array[Record] = ???

  def operate(policy: WritePolicy, listener: RecordListener, key: Key, operations: Operation*): Unit = ???

  def operate(policy: WritePolicy, key: Key, operations: Operation*): Record = ???

  def scanAll(policy: ScanPolicy, listener: RecordSequenceListener, namespace: String, setName: String, binNames: String*): Unit = ???

  def scanAll(policy: ScanPolicy, namespace: String, setName: String, callback: ScanCallback, binNames: String*): Unit = ???

  def execute(policy: WritePolicy, listener: ExecuteListener, key: Key, packageName: String, functionName: String, functionArgs: Value*): Unit = ???

  def query(policy: QueryPolicy, listener: RecordSequenceListener, statement: Statement): Unit = ???

  def getLargeList(policy: Policy, key: Key, binName: String, userModule: String): LargeList = ???

  def getLargeList(policy: WritePolicy, key: Key, binName: String, userModule: String): LargeList = ???

  def getLargeList(policy: WritePolicy, key: Key, binName: String): LargeList = ???

  def getLargeMap(policy: Policy, key: Key, binName: String, userModule: String): LargeMap = ???

  def getLargeMap(policy: WritePolicy, key: Key, binName: String, userModule: String): LargeMap = ???

  def getLargeSet(policy: Policy, key: Key, binName: String, userModule: String): LargeSet = ???

  def getLargeSet(policy: WritePolicy, key: Key, binName: String, userModule: String): LargeSet = ???

  def getLargeStack(policy: Policy, key: Key, binName: String, userModule: String): LargeStack = ???

  def getLargeStack(policy: WritePolicy, key: Key, binName: String, userModule: String): LargeStack = ???

  def register(policy: Policy, clientPath: String, serverPath: String, language: Language): RegisterTask = ???

  def register(policy: Policy, resourceLoader: ClassLoader, resourcePath: String, serverPath: String, language: Language): RegisterTask = ???

  def registerUdfString(policy: Policy, code: String, serverPath: String, language: Language): RegisterTask = ???

  def removeUdf(policy: InfoPolicy, serverPath: String): Unit = ???

  def execute(policy: WritePolicy, key: Key, packageName: String, functionName: String, args: Value*): Any = ???

  def execute(policy: WritePolicy, statement: Statement, packageName: String, functionName: String, functionArgs: Value*): ExecuteTask = ???

  def query(policy: QueryPolicy, statement: Statement): RecordSet = ???

  def queryNode(policy: QueryPolicy, statement: Statement, node: Node): RecordSet = ???

  def queryAggregate(policy: QueryPolicy, statement: Statement, packageName: String, functionName: String, functionArgs: Value*): ResultSet = ???

  def queryAggregate(policy: QueryPolicy, statement: Statement): ResultSet = ???

  def queryAggregateNode(policy: QueryPolicy, statement: Statement, node: Node): ResultSet = ???

  def createIndex(policy: Policy, namespace: String, setName: String, indexName: String, binName: String, indexType: IndexType): IndexTask = ???

  def createIndex(policy: Policy, namespace: String, setName: String, indexName: String, binName: String, indexType: IndexType, indexCollectionType: IndexCollectionType): IndexTask = ???

  def dropIndex(policy: Policy, namespace: String, setName: String, indexName: String): Unit = ???

  def createUser(policy: AdminPolicy, user: String, password: String, roles: java.util.List[String]): Unit = ???

  def dropUser(policy: AdminPolicy, user: String): Unit = ???

  def changePassword(policy: AdminPolicy, user: String, password: String): Unit = ???

  def grantRoles(policy: AdminPolicy, user: String, roles: java.util.List[String]): Unit = ???

  def revokeRoles(policy: AdminPolicy, user: String, roles: java.util.List[String]): Unit = ???

  def createRole(policy: AdminPolicy, roleName: String, privileges: java.util.List[Privilege]): Unit = ???

  def dropRole(policy: AdminPolicy, roleName: String): Unit = ???

  def grantPrivileges(policy: AdminPolicy, roleName: String, privileges: java.util.List[Privilege]): Unit = ???

  def revokePrivileges(policy: AdminPolicy, roleName: String, privileges: java.util.List[Privilege]): Unit = ???

  def queryUser(policy: AdminPolicy, user: String): User = ???

  def queryUsers(policy: AdminPolicy): java.util.List[User] = ???

  def queryRole(policy: AdminPolicy, roleName: String): Role = ???

  def queryRoles(policy: AdminPolicy): java.util.List[Role] = ???


  val cluster = new Cluster(new ClientPolicy(), Array(new Host("111", 8080)))
  val et1 = new ExecuteTask(cluster, new Policy(), new Statement())
  val rt1 = new RegisterTask(cluster, new Policy(), "s")
  /*  val node = new Node(cluster, new NodeValidator())
    val queryExecutor = new QueryExecutor(cluster, new QueryPolicy(), new Statement(), node) {
      override def sendCancel() = {}
      override def sendCompleted() = {}
      override def createCommand(node: Node): MultiCommand = new MultiCommand(node, true) {
        override def getPolicy: Policy = new Policy()
        override def parseRow(key: Key): Unit = {}
        override def writeBuffer() = {}
      }
    }
    val rs = new RecordSet(queryExecutor, new DelayQueue[KeyRecord](),
      new KeyRecord(new Key("kName", "ns", 1), new Record(Map("k" -> new StringValue("v")), 100, 12)), true)*/

}


case class ReadHandler(key: Key = new Key("kName", "ns", 1),
                       record: Record = new Record(Map("k" -> new StringValue("v")), 100, 12)) extends RecordListener {
  def onSuccess(key: Key, record: Record): Unit = {}

  def onFailure(e: AerospikeException): Unit = e.printStackTrace()
}

case class WriteHandler(k: Key = new Key("kName", "ns", 1)) extends WriteListener {
  def onSuccess(key: Key): Unit = {}

  def onFailure(e: AerospikeException): Unit = e.printStackTrace()
}

case class DeleteHandler(key: Key = new Key("kName", "ns", 1)) extends DeleteListener {
  def onSuccess(key: Key, existed: Boolean): Unit = {}

  def onFailure(e: AerospikeException): Unit = e.printStackTrace()
}

case class ExecuteHandler(k: Key = new Key("kName", "ns", 1), obj: Object = "") extends ExecuteListener {
  def onSuccess(key: Key, obj: Object): Unit = {}

  def onFailure(e: AerospikeException): Unit = e.printStackTrace()
}

case class ExistsHandler(k: Key = new Key("kName", "ns", 1), exists: Boolean = true) extends ExistsListener {
  def onSuccess(key: Key, exists: Boolean): Unit = {}

  def onFailure(e: AerospikeException): Unit = e.printStackTrace()
}

case class ExistsArrayHandler(keys: Array[Key] = Array(new Key("kName", "ns", 1)), exists: Array[Boolean] = Array(true)) extends ExistsArrayListener {
  def onSuccess(keys: Array[Key], exists: Array[Boolean]): Unit = {}

  def onFailure(e: AerospikeException): Unit = e.printStackTrace()
}

case class ExistsSequenceHandler(k: Key = new Key("kName", "ns", 1), exists: Boolean = true) extends ExistsSequenceListener {
  def onExists(key: Key, exists: Boolean): Unit = {}
  def onSuccess(): Unit = {}

  def onFailure(e: AerospikeException): Unit = e.printStackTrace()
}

case class RecordSequenceHandler(k: Key = new Key("kName", "ns", 1), record: Record = new Record(Map("k" -> new StringValue("v")), 100, 12)) extends RecordSequenceListener {
  def onRecord(key: Key, record: Record): Unit = {}
  def onSuccess(): Unit = {}

  def onFailure(e: AerospikeException): Unit = e.printStackTrace()
}

case class ScanCallbackImpl(k: Key = new Key("kName", "ns", 1), record: Record = new Record(Map("k" -> new StringValue("v")), 100, 12)) extends ScanCallback {
  def scanCallback(k: Key = new Key("kName", "ns", 1),
                   record: Record = new Record(Map("k" -> new StringValue("v")), 100, 12)) = {}
}