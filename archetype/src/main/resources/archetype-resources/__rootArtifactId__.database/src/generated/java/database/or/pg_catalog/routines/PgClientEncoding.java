/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.routines;


import ${package}.database.or.pg_catalog.PgCatalog;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgClientEncoding extends AbstractRoutine<String> {

    private static final long serialVersionUID = -1183635748;

    /**
     * The parameter <code>pg_catalog.pg_client_encoding.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * Create a new routine call instance
     */
    public PgClientEncoding() {
        super("pg_client_encoding", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.VARCHAR);

        setReturnParameter(RETURN_VALUE);
    }
}
