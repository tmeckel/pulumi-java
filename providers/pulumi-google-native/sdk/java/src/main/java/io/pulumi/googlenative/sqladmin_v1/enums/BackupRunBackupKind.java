// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the kind of backup, PHYSICAL or DEFAULT_SNAPSHOT.
     * 
     */
    @EnumType
    public enum BackupRunBackupKind {
        /**
         * This is an unknown BackupKind.
         * 
         */
        SqlBackupKindUnspecified("SQL_BACKUP_KIND_UNSPECIFIED"),
        /**
         * The snapshot based backups
         * 
         */
        Snapshot("SNAPSHOT"),
        /**
         * Physical backups
         * 
         */
        Physical("PHYSICAL");

        private final String value;

        BackupRunBackupKind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BackupRunBackupKind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
