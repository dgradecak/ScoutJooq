/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.routines;


import com.acme.application.database.generator.converter.DateConverter;
import com.acme.application.database.or.pg_catalog.PgCatalog;

import java.util.Date;

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

/**
 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
 */
@java.lang.Deprecated
public class DateOut extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -1865461403;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("cstring"), false, false);

    /**
     * The parameter <code>pg_catalog.date_out._1</code>.
     */
    public static final Parameter<Date> _1 = createParameter("_1", org.jooq.impl.SQLDataType.DATE, false, true, new DateConverter());

    /**
     * Create a new routine call instance
     */
    public DateOut() {
        super("date_out", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("cstring"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Date value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Date> field) {
        setField(_1, field);
    }
}
