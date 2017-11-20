/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.routines;


import com.acme.application.database.generator.converter.LongConverter;
import com.acme.application.database.or.pg_catalog.PgCatalog;

import java.math.BigDecimal;

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
public class PgStatGetBgwriterRequestedCheckpoints extends AbstractRoutine<BigDecimal> {

    private static final long serialVersionUID = 341372068;

    /**
     * The parameter <code>pg_catalog.pg_stat_get_bgwriter_requested_checkpoints.RETURN_VALUE</code>.
     */
    public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT, false, false, new LongConverter());

    /**
     * Create a new routine call instance
     */
    public PgStatGetBgwriterRequestedCheckpoints() {
        super("pg_stat_get_bgwriter_requested_checkpoints", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BIGINT, new LongConverter());

        setReturnParameter(RETURN_VALUE);
    }
}