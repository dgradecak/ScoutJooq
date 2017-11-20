/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.tables.records;


import com.acme.application.database.or.pg_catalog.tables.PgAvailableExtensions;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class PgAvailableExtensionsRecord extends TableRecordImpl<PgAvailableExtensionsRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = -535850915;

    /**
     * Setter for <code>pg_catalog.pg_available_extensions.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_available_extensions.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_available_extensions.default_version</code>.
     */
    public void setDefaultVersion(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_available_extensions.default_version</code>.
     */
    public String getDefaultVersion() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_available_extensions.installed_version</code>.
     */
    public void setInstalledVersion(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_available_extensions.installed_version</code>.
     */
    public String getInstalledVersion() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_available_extensions.comment</code>.
     */
    public void setComment(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_available_extensions.comment</code>.
     */
    public String getComment() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgAvailableExtensions.PG_AVAILABLE_EXTENSIONS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgAvailableExtensions.PG_AVAILABLE_EXTENSIONS.DEFAULT_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgAvailableExtensions.PG_AVAILABLE_EXTENSIONS.INSTALLED_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgAvailableExtensions.PG_AVAILABLE_EXTENSIONS.COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDefaultVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getInstalledVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDefaultVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getInstalledVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAvailableExtensionsRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAvailableExtensionsRecord value2(String value) {
        setDefaultVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAvailableExtensionsRecord value3(String value) {
        setInstalledVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAvailableExtensionsRecord value4(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAvailableExtensionsRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgAvailableExtensionsRecord
     */
    public PgAvailableExtensionsRecord() {
        super(PgAvailableExtensions.PG_AVAILABLE_EXTENSIONS);
    }

    /**
     * Create a detached, initialised PgAvailableExtensionsRecord
     */
    public PgAvailableExtensionsRecord(String name, String defaultVersion, String installedVersion, String comment) {
        super(PgAvailableExtensions.PG_AVAILABLE_EXTENSIONS);

        set(0, name);
        set(1, defaultVersion);
        set(2, installedVersion);
        set(3, comment);
    }
}
