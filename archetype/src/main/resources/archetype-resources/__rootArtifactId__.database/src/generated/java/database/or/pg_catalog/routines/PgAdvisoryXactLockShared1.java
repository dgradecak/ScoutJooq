/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.routines;


import ${package}.database.generator.converter.LongConverter;
import ${package}.database.or.pg_catalog.PgCatalog;

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
public class PgAdvisoryXactLockShared1 extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -2038148232;

    /**
     * The parameter <code>pg_catalog.pg_advisory_xact_lock_shared._1</code>.
     */
    public static final Parameter<BigDecimal> _1 = createParameter("_1", org.jooq.impl.SQLDataType.BIGINT, false, true, new LongConverter());

    /**
     * Create a new routine call instance
     */
    public PgAdvisoryXactLockShared1() {
        super("pg_advisory_xact_lock_shared", PgCatalog.PG_CATALOG);

        addInParameter(_1);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(BigDecimal value) {
        setValue(_1, value);
    }
}
