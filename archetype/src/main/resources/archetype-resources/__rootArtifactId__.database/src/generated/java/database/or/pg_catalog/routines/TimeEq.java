/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.routines;


import ${package}.database.or.pg_catalog.PgCatalog;

import java.sql.Time;

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
public class TimeEq extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = -807558806;

    /**
     * The parameter <code>pg_catalog.time_eq.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>pg_catalog.time_eq._1</code>.
     */
    public static final Parameter<Time> _1 = createParameter("_1", org.jooq.impl.SQLDataType.TIME, false, true);

    /**
     * The parameter <code>pg_catalog.time_eq._2</code>.
     */
    public static final Parameter<Time> _2 = createParameter("_2", org.jooq.impl.SQLDataType.TIME, false, true);

    /**
     * Create a new routine call instance
     */
    public TimeEq() {
        super("time_eq", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Time value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Time> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Time value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Time> field) {
        setField(_2, field);
    }
}
