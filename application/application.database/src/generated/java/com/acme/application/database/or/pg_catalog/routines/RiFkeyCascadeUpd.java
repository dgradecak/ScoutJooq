/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.routines;


import com.acme.application.database.or.pg_catalog.PgCatalog;

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

/**
 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
 */
@java.lang.Deprecated
public class RiFkeyCascadeUpd extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1009298492;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("trigger"), false, false);

    /**
     * Create a new routine call instance
     */
    public RiFkeyCascadeUpd() {
        super("RI_FKey_cascade_upd", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("trigger"));

        setReturnParameter(RETURN_VALUE);
    }
}
