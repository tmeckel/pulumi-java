// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class JobSparksqlConfigLoggingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobSparksqlConfigLoggingConfigArgs Empty = new JobSparksqlConfigLoggingConfigArgs();

    @Import(name="driverLogLevels", required=true)
      private final Output<Map<String,String>> driverLogLevels;

    public Output<Map<String,String>> getDriverLogLevels() {
        return this.driverLogLevels;
    }

    public JobSparksqlConfigLoggingConfigArgs(Output<Map<String,String>> driverLogLevels) {
        this.driverLogLevels = Objects.requireNonNull(driverLogLevels, "expected parameter 'driverLogLevels' to be non-null");
    }

    private JobSparksqlConfigLoggingConfigArgs() {
        this.driverLogLevels = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSparksqlConfigLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Map<String,String>> driverLogLevels;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSparksqlConfigLoggingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverLogLevels = defaults.driverLogLevels;
        }

        public Builder driverLogLevels(Output<Map<String,String>> driverLogLevels) {
            this.driverLogLevels = Objects.requireNonNull(driverLogLevels);
            return this;
        }
        public Builder driverLogLevels(Map<String,String> driverLogLevels) {
            this.driverLogLevels = Output.of(Objects.requireNonNull(driverLogLevels));
            return this;
        }        public JobSparksqlConfigLoggingConfigArgs build() {
            return new JobSparksqlConfigLoggingConfigArgs(driverLogLevels);
        }
    }
}
