// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set disk storage settings for SQL Server.
 * 
 */
public final class SQLStorageSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final SQLStorageSettingsResponse Empty = new SQLStorageSettingsResponse();

    /**
     * SQL Server default file path
     * 
     */
    @Import(name="defaultFilePath")
    private @Nullable String defaultFilePath;

    /**
     * @return SQL Server default file path
     * 
     */
    public Optional<String> defaultFilePath() {
        return Optional.ofNullable(this.defaultFilePath);
    }

    /**
     * Logical Unit Numbers for the disks.
     * 
     */
    @Import(name="luns")
    private @Nullable List<Integer> luns;

    /**
     * @return Logical Unit Numbers for the disks.
     * 
     */
    public Optional<List<Integer>> luns() {
        return Optional.ofNullable(this.luns);
    }

    private SQLStorageSettingsResponse() {}

    private SQLStorageSettingsResponse(SQLStorageSettingsResponse $) {
        this.defaultFilePath = $.defaultFilePath;
        this.luns = $.luns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SQLStorageSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SQLStorageSettingsResponse $;

        public Builder() {
            $ = new SQLStorageSettingsResponse();
        }

        public Builder(SQLStorageSettingsResponse defaults) {
            $ = new SQLStorageSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultFilePath SQL Server default file path
         * 
         * @return builder
         * 
         */
        public Builder defaultFilePath(@Nullable String defaultFilePath) {
            $.defaultFilePath = defaultFilePath;
            return this;
        }

        /**
         * @param luns Logical Unit Numbers for the disks.
         * 
         * @return builder
         * 
         */
        public Builder luns(@Nullable List<Integer> luns) {
            $.luns = luns;
            return this;
        }

        /**
         * @param luns Logical Unit Numbers for the disks.
         * 
         * @return builder
         * 
         */
        public Builder luns(Integer... luns) {
            return luns(List.of(luns));
        }

        public SQLStorageSettingsResponse build() {
            return $;
        }
    }

}
