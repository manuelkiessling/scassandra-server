package org.scassandra.priming.prepared

import org.scassandra.cqlmessages.{Consistency, ColumnType}
import org.scassandra.priming.{Success, Result}

case class PrimePreparedSingle(when: WhenPreparedSingle, then: ThenPreparedSingle)

case class WhenPreparedSingle(query: String, consistency: Option[List[Consistency]] = None)
case class ThenPreparedSingle(rows: Option[List[Map[String, Any]]],
                              variable_types: Option[List[ColumnType[_]]] = None,
                              column_types: Option[Map[String, ColumnType[_]]] = None,
                              result : Option[Result] = Some(Success)
                               )