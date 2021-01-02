/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.generated.tables;


import org.blackdread.sqltojava.jooq.generated.InformationSchema;
import org.blackdread.sqltojava.jooq.generated.tables.records.InnodbCmpPerIndexRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class InnodbCmpPerIndex extends TableImpl<InnodbCmpPerIndexRecord> {

    /**
     * The reference instance of <code>information_schema.INNODB_CMP_PER_INDEX</code>
     */
    public static final InnodbCmpPerIndex INNODB_CMP_PER_INDEX = new InnodbCmpPerIndex();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX.database_name</code>.
     */
    public final TableField<InnodbCmpPerIndexRecord, String> DATABASE_NAME = createField(DSL.name("database_name"), SQLDataType.VARCHAR(192).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX.table_name</code>.
     */
    public final TableField<InnodbCmpPerIndexRecord, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR(192).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX.index_name</code>.
     */
    public final TableField<InnodbCmpPerIndexRecord, String> INDEX_NAME = createField(DSL.name("index_name"), SQLDataType.VARCHAR(192).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX.compress_ops</code>.
     */
    public final TableField<InnodbCmpPerIndexRecord, Integer> COMPRESS_OPS = createField(DSL.name("compress_ops"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");
    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX.compress_ops_ok</code>.
     */
    public final TableField<InnodbCmpPerIndexRecord, Integer> COMPRESS_OPS_OK = createField(DSL.name("compress_ops_ok"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");
    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX.compress_time</code>.
     */
    public final TableField<InnodbCmpPerIndexRecord, Integer> COMPRESS_TIME = createField(DSL.name("compress_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");
    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX.uncompress_ops</code>.
     */
    public final TableField<InnodbCmpPerIndexRecord, Integer> UNCOMPRESS_OPS = createField(DSL.name("uncompress_ops"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");
    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX.uncompress_time</code>.
     */
    public final TableField<InnodbCmpPerIndexRecord, Integer> UNCOMPRESS_TIME = createField(DSL.name("uncompress_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    private InnodbCmpPerIndex(Name alias, Table<InnodbCmpPerIndexRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbCmpPerIndex(Name alias, Table<InnodbCmpPerIndexRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMP_PER_INDEX</code> table reference
     */
    public InnodbCmpPerIndex(String alias) {
        this(DSL.name(alias), INNODB_CMP_PER_INDEX);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMP_PER_INDEX</code> table reference
     */
    public InnodbCmpPerIndex(Name alias) {
        this(alias, INNODB_CMP_PER_INDEX);
    }

    /**
     * Create a <code>information_schema.INNODB_CMP_PER_INDEX</code> table reference
     */
    public InnodbCmpPerIndex() {
        this(DSL.name("INNODB_CMP_PER_INDEX"), null);
    }

    public <O extends Record> InnodbCmpPerIndex(Table<O> child, ForeignKey<O, InnodbCmpPerIndexRecord> key) {
        super(child, key, INNODB_CMP_PER_INDEX);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbCmpPerIndexRecord> getRecordType() {
        return InnodbCmpPerIndexRecord.class;
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbCmpPerIndex as(String alias) {
        return new InnodbCmpPerIndex(DSL.name(alias), this);
    }

    @Override
    public InnodbCmpPerIndex as(Name alias) {
        return new InnodbCmpPerIndex(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpPerIndex rename(String name) {
        return new InnodbCmpPerIndex(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpPerIndex rename(Name name) {
        return new InnodbCmpPerIndex(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
