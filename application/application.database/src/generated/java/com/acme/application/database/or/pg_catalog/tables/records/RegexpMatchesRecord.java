/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.tables.records;


import com.acme.application.database.or.pg_catalog.tables.RegexpMatches;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


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
public class RegexpMatchesRecord extends TableRecordImpl<RegexpMatchesRecord> implements Record1<String[]> {

    private static final long serialVersionUID = -1289990145;

    /**
     * Setter for <code>pg_catalog.regexp_matches.regexp_matches</code>.
     */
    public void setRegexpMatches(String... value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.regexp_matches.regexp_matches</code>.
     */
    public String[] getRegexpMatches() {
        return (String[]) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String[]> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String[]> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field1() {
        return RegexpMatches.REGEXP_MATCHES.REGEXP_MATCHES_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component1() {
        return getRegexpMatches();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value1() {
        return getRegexpMatches();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RegexpMatchesRecord value1(String... value) {
        setRegexpMatches(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RegexpMatchesRecord values(String[] value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RegexpMatchesRecord
     */
    public RegexpMatchesRecord() {
        super(RegexpMatches.REGEXP_MATCHES);
    }

    /**
     * Create a detached, initialised RegexpMatchesRecord
     */
    public RegexpMatchesRecord(String[] regexpMatches) {
        super(RegexpMatches.REGEXP_MATCHES);

        set(0, regexpMatches);
    }
}
