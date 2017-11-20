/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.routines;


import ${package}.database.or.pg_catalog.PgCatalog;

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
public class MakeInterval extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 804558488;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("interval"), false, false);

    /**
     * The parameter <code>pg_catalog.make_interval.years</code>.
     */
    public static final Parameter<Integer> YEARS = createParameter("years", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_interval.months</code>.
     */
    public static final Parameter<Integer> MONTHS = createParameter("months", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_interval.weeks</code>.
     */
    public static final Parameter<Integer> WEEKS = createParameter("weeks", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_interval.days</code>.
     */
    public static final Parameter<Integer> DAYS = createParameter("days", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_interval.hours</code>.
     */
    public static final Parameter<Integer> HOURS = createParameter("hours", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_interval.mins</code>.
     */
    public static final Parameter<Integer> MINS = createParameter("mins", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.make_interval.secs</code>.
     */
    public static final Parameter<Double> SECS = createParameter("secs", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * Create a new routine call instance
     */
    public MakeInterval() {
        super("make_interval", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("interval"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(YEARS);
        addInParameter(MONTHS);
        addInParameter(WEEKS);
        addInParameter(DAYS);
        addInParameter(HOURS);
        addInParameter(MINS);
        addInParameter(SECS);
    }

    /**
     * Set the <code>years</code> parameter IN value to the routine
     */
    public void setYears(Integer value) {
        setValue(YEARS, value);
    }

    /**
     * Set the <code>years</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setYears(Field<Integer> field) {
        setField(YEARS, field);
    }

    /**
     * Set the <code>months</code> parameter IN value to the routine
     */
    public void setMonths(Integer value) {
        setValue(MONTHS, value);
    }

    /**
     * Set the <code>months</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMonths(Field<Integer> field) {
        setField(MONTHS, field);
    }

    /**
     * Set the <code>weeks</code> parameter IN value to the routine
     */
    public void setWeeks(Integer value) {
        setValue(WEEKS, value);
    }

    /**
     * Set the <code>weeks</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setWeeks(Field<Integer> field) {
        setField(WEEKS, field);
    }

    /**
     * Set the <code>days</code> parameter IN value to the routine
     */
    public void setDays(Integer value) {
        setValue(DAYS, value);
    }

    /**
     * Set the <code>days</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setDays(Field<Integer> field) {
        setField(DAYS, field);
    }

    /**
     * Set the <code>hours</code> parameter IN value to the routine
     */
    public void setHours(Integer value) {
        setValue(HOURS, value);
    }

    /**
     * Set the <code>hours</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setHours(Field<Integer> field) {
        setField(HOURS, field);
    }

    /**
     * Set the <code>mins</code> parameter IN value to the routine
     */
    public void setMins(Integer value) {
        setValue(MINS, value);
    }

    /**
     * Set the <code>mins</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMins(Field<Integer> field) {
        setField(MINS, field);
    }

    /**
     * Set the <code>secs</code> parameter IN value to the routine
     */
    public void setSecs(Double value) {
        setValue(SECS, value);
    }

    /**
     * Set the <code>secs</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setSecs(Field<Double> field) {
        setField(SECS, field);
    }
}
