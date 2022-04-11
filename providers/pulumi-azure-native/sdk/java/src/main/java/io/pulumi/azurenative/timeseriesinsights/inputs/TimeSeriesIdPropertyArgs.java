// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.inputs;

import io.pulumi.azurenative.timeseriesinsights.enums.PropertyType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The structure of the property that a time series id can have. An environment can have multiple such properties.
 * 
 */
public final class TimeSeriesIdPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimeSeriesIdPropertyArgs Empty = new TimeSeriesIdPropertyArgs();

    /**
     * The name of the property.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The type of the property.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,PropertyType>> type;

    public Output<Either<String,PropertyType>> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public TimeSeriesIdPropertyArgs(
        @Nullable Output<String> name,
        @Nullable Output<Either<String,PropertyType>> type) {
        this.name = name;
        this.type = type;
    }

    private TimeSeriesIdPropertyArgs() {
        this.name = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeSeriesIdPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<Either<String,PropertyType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeSeriesIdPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder type(@Nullable Output<Either<String,PropertyType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,PropertyType> type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public TimeSeriesIdPropertyArgs build() {
            return new TimeSeriesIdPropertyArgs(name, type);
        }
    }
}
