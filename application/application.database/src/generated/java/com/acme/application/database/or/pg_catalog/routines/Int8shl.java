/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.routines;


import com.acme.application.database.generator.converter.LongConverter;
import com.acme.application.database.or.pg_catalog.PgCatalog;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class Int8shl extends AbstractRoutine<BigDecimal> {

    private static final long serialVersionUID = -1262649012;

    /**
     * The parameter <code>pg_catalog.int8shl.RETURN_VALUE</code>.
     */
    public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT, false, false, new LongConverter());

    /**
     * The parameter <code>pg_catalog.int8shl._1</code>.
     */
    public static final Parameter<BigDecimal> _1 = createParameter("_1", org.jooq.impl.SQLDataType.BIGINT, false, true, new LongConverter());

    /**
     * The parameter <code>pg_catalog.int8shl._2</code>.
     */
    public static final Parameter<Integer> _2 = createParameter("_2", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * Create a new routine call instance
     */
    public Int8shl() {
        super("int8shl", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BIGINT, new LongConverter());

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(BigDecimal value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<BigDecimal> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Integer value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Integer> field) {
        setField(_2, field);
    }
}
