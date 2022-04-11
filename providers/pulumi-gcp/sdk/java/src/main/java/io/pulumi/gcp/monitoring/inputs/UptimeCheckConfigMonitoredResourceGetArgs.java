// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class UptimeCheckConfigMonitoredResourceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigMonitoredResourceGetArgs Empty = new UptimeCheckConfigMonitoredResourceGetArgs();

    /**
     * Values for all of the labels listed in the associated monitored resource descriptor. For example, Compute Engine VM instances use the labels "project_id", "instance_id", and "zone".
     * 
     */
    @Import(name="labels", required=true)
      private final Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }

    /**
     * The monitored resource type. This field must match the type field of a MonitoredResourceDescriptor (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.monitoredResourceDescriptors#MonitoredResourceDescriptor) object. For example, the type of a Compute Engine VM instance is gce_instance. For a list of types, see Monitoring resource types (https://cloud.google.com/monitoring/api/resources) and Logging resource types (https://cloud.google.com/logging/docs/api/v2/resource-list).
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public UptimeCheckConfigMonitoredResourceGetArgs(
        Output<Map<String,String>> labels,
        Output<String> type) {
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private UptimeCheckConfigMonitoredResourceGetArgs() {
        this.labels = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigMonitoredResourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Map<String,String>> labels;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(UptimeCheckConfigMonitoredResourceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.type = defaults.type;
        }

        public Builder labels(Output<Map<String,String>> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Output.of(Objects.requireNonNull(labels));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public UptimeCheckConfigMonitoredResourceGetArgs build() {
            return new UptimeCheckConfigMonitoredResourceGetArgs(labels, type);
        }
    }
}
