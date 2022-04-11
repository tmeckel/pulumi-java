// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.enums.FunctionType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The aggregation expression to be used in the report.
 * 
 */
public final class ReportConfigAggregationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportConfigAggregationArgs Empty = new ReportConfigAggregationArgs();

    /**
     * The name of the aggregation function to use.
     * 
     */
    @Import(name="function", required=true)
      private final Output<Either<String,FunctionType>> function;

    public Output<Either<String,FunctionType>> getFunction() {
        return this.function;
    }

    /**
     * The name of the column to aggregate.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public ReportConfigAggregationArgs(
        Output<Either<String,FunctionType>> function,
        Output<String> name) {
        this.function = Objects.requireNonNull(function, "expected parameter 'function' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ReportConfigAggregationArgs() {
        this.function = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportConfigAggregationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,FunctionType>> function;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportConfigAggregationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.function = defaults.function;
    	      this.name = defaults.name;
        }

        public Builder function(Output<Either<String,FunctionType>> function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }
        public Builder function(Either<String,FunctionType> function) {
            this.function = Output.of(Objects.requireNonNull(function));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public ReportConfigAggregationArgs build() {
            return new ReportConfigAggregationArgs(function, name);
        }
    }
}
