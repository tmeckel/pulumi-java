// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureDatabricksDeltaLakeExportCommandResponse {
    /**
     * @return Specify the date format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object dateFormat;
    /**
     * @return Specify the timestamp format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object timestampFormat;
    /**
     * @return The export setting type.
     * Expected value is &#39;AzureDatabricksDeltaLakeExportCommand&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AzureDatabricksDeltaLakeExportCommandResponse(
        @CustomType.Parameter("dateFormat") @Nullable Object dateFormat,
        @CustomType.Parameter("timestampFormat") @Nullable Object timestampFormat,
        @CustomType.Parameter("type") String type) {
        this.dateFormat = dateFormat;
        this.timestampFormat = timestampFormat;
        this.type = type;
    }

    /**
     * @return Specify the date format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> dateFormat() {
        return Optional.ofNullable(this.dateFormat);
    }
    /**
     * @return Specify the timestamp format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> timestampFormat() {
        return Optional.ofNullable(this.timestampFormat);
    }
    /**
     * @return The export setting type.
     * Expected value is &#39;AzureDatabricksDeltaLakeExportCommand&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDatabricksDeltaLakeExportCommandResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object dateFormat;
        private @Nullable Object timestampFormat;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDatabricksDeltaLakeExportCommandResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateFormat = defaults.dateFormat;
    	      this.timestampFormat = defaults.timestampFormat;
    	      this.type = defaults.type;
        }

        public Builder dateFormat(@Nullable Object dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }
        public Builder timestampFormat(@Nullable Object timestampFormat) {
            this.timestampFormat = timestampFormat;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AzureDatabricksDeltaLakeExportCommandResponse build() {
            return new AzureDatabricksDeltaLakeExportCommandResponse(dateFormat, timestampFormat, type);
        }
    }
}
