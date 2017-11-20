/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.routines;


import com.acme.application.database.or.pg_catalog.PgCatalog;

import java.time.OffsetDateTime;

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
public class TransactionTimestamp extends AbstractRoutine<OffsetDateTime> {

    private static final long serialVersionUID = 375761429;

    /**
     * The parameter <code>pg_catalog.transaction_timestamp.RETURN_VALUE</code>.
     */
    public static final Parameter<OffsetDateTime> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, false, false);

    /**
     * Create a new routine call instance
     */
    public TransactionTimestamp() {
        super("transaction_timestamp", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE);

        setReturnParameter(RETURN_VALUE);
    }
}