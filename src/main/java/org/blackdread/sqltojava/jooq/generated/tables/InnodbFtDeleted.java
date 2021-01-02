/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.generated.tables;


import org.blackdread.sqltojava.jooq.generated.InformationSchema;
import org.blackdread.sqltojava.jooq.generated.tables.records.InnodbFtDeletedRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row1;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class InnodbFtDeleted extends TableImpl<InnodbFtDeletedRecord> {

    /**
     * The reference instance of <code>information_schema.INNODB_FT_DELETED</code>
     */
    public static final InnodbFtDeleted INNODB_FT_DELETED = new InnodbFtDeleted();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>information_schema.INNODB_FT_DELETED.DOC_ID</code>.
     */
    public final TableField<InnodbFtDeletedRecord, ULong> DOC_ID = createField(DSL.name("DOC_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    private InnodbFtDeleted(Name alias, Table<InnodbFtDeletedRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbFtDeleted(Name alias, Table<InnodbFtDeletedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FT_DELETED</code> table reference
     */
    public InnodbFtDeleted(String alias) {
        this(DSL.name(alias), INNODB_FT_DELETED);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FT_DELETED</code> table reference
     */
    public InnodbFtDeleted(Name alias) {
        this(alias, INNODB_FT_DELETED);
    }

    /**
     * Create a <code>information_schema.INNODB_FT_DELETED</code> table reference
     */
    public InnodbFtDeleted() {
        this(DSL.name("INNODB_FT_DELETED"), null);
    }

    public <O extends Record> InnodbFtDeleted(Table<O> child, ForeignKey<O, InnodbFtDeletedRecord> key) {
        super(child, key, INNODB_FT_DELETED);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbFtDeletedRecord> getRecordType() {
        return InnodbFtDeletedRecord.class;
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbFtDeleted as(String alias) {
        return new InnodbFtDeleted(DSL.name(alias), this);
    }

    @Override
    public InnodbFtDeleted as(Name alias) {
        return new InnodbFtDeleted(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbFtDeleted rename(String name) {
        return new InnodbFtDeleted(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbFtDeleted rename(Name name) {
        return new InnodbFtDeleted(name, null);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<ULong> fieldsRow() {
        return (Row1) super.fieldsRow();
    }
}
