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
public class CurrentDatabase extends AbstractRoutine<String> {

    private static final long serialVersionUID = -1717506670;

    /**
     * The parameter <code>pg_catalog.current_database.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * Create a new routine call instance
     */
    public CurrentDatabase() {
        super("current_database", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.VARCHAR);

        setReturnParameter(RETURN_VALUE);
    }
}
