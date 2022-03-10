// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.enums.DataSourceErrorInfoType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceErrorInfo {
    /**
     * <p>Error message.</p>
     * 
     */
    private final @Nullable String message;
    private final @Nullable DataSourceErrorInfoType type;

    @OutputCustomType.Constructor
    private DataSourceErrorInfo(
        @OutputCustomType.Parameter("message") @Nullable String message,
        @OutputCustomType.Parameter("type") @Nullable DataSourceErrorInfoType type) {
        this.message = message;
        this.type = type;
    }

    /**
     * <p>Error message.</p>
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    public Optional<DataSourceErrorInfoType> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceErrorInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String message;
        private @Nullable DataSourceErrorInfoType type;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceErrorInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.type = defaults.type;
        }

        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder type(@Nullable DataSourceErrorInfoType type) {
            this.type = type;
            return this;
        }
        public DataSourceErrorInfo build() {
            return new DataSourceErrorInfo(message, type);
        }
    }
}
