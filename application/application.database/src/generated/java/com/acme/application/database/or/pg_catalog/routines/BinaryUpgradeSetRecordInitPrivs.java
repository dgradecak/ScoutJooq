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
public class BinaryUpgradeSetRecordInitPrivs extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 574074861;

    /**
     * The parameter <code>pg_catalog.binary_upgrade_set_record_init_privs._1</code>.
     */
    public static final Parameter<Boolean> _1 = createParameter("_1", org.jooq.impl.SQLDataType.BOOLEAN, false, true);

    /**
     * Create a new routine call instance
     */
    public BinaryUpgradeSetRecordInitPrivs() {
        super("binary_upgrade_set_record_init_privs", PgCatalog.PG_CATALOG);

        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Boolean value) {
        setValue(_1, value);
    }
}
