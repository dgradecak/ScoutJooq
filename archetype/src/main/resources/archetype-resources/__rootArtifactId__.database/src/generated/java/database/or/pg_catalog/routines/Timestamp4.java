/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.routines;


import ${package}.database.generator.converter.DateConverter;
import ${package}.database.or.pg_catalog.PgCatalog;

import java.sql.Time;
import java.sql.Timestamp;
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
public class Timestamp4 extends AbstractRoutine<Timestamp> {

    private static final long serialVersionUID = 411069229;

    /**
     * The parameter <code>pg_catalog.timestamp.RETURN_VALUE</code>.
     */
    public static final Parameter<Timestamp> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMESTAMP, false, false);

    /**
     * The parameter <code>pg_catalog.timestamp._1</code>.
     */
    public static final Parameter<Date> _1 = createParameter("_1", org.jooq.impl.SQLDataType.DATE, false, true, new DateConverter());

    /**
     * The parameter <code>pg_catalog.timestamp._2</code>.
     */
    public static final Parameter<Time> _2 = createParameter("_2", org.jooq.impl.SQLDataType.TIME, false, true);

    /**
     * Create a new routine call instance
     */
    public Timestamp4() {
        super("timestamp", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIMESTAMP);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
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
