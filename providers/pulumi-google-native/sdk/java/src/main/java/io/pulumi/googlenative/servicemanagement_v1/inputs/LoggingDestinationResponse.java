// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configuration of a specific logging destination (the producer project or the consumer project).
 * 
 */
public final class LoggingDestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoggingDestinationResponse Empty = new LoggingDestinationResponse();

    /**
     * Names of the logs to be sent to this destination. Each name must be defined in the Service.logs section. If the log name is not a domain scoped name, it will be automatically prefixed with the service name followed by "/".
     * 
     */
    @InputImport(name="logs", required=true)
    private final List<String> logs;

    public List<String> getLogs() {
        return this.logs;
    }

    /**
     * The monitored resource type. The type must be defined in the Service.monitored_resources section.
     * 
     */
    @InputImport(name="monitoredResource", required=true)
    private final String monitoredResource;

    public String getMonitoredResource() {
        return this.monitoredResource;
    }

    public LoggingDestinationResponse(
        List<String> logs,
        String monitoredResource) {
        this.logs = Objects.requireNonNull(logs, "expected parameter 'logs' to be non-null");
        this.monitoredResource = Objects.requireNonNull(monitoredResource, "expected parameter 'monitoredResource' to be non-null");
    }

    private LoggingDestinationResponse() {
        this.logs = List.of();
        this.monitoredResource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> logs;
        private String monitoredResource;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logs = defaults.logs;
    	      this.monitoredResource = defaults.monitoredResource;
        }

        public Builder setLogs(List<String> logs) {
            this.logs = Objects.requireNonNull(logs);
            return this;
        }

        public Builder setMonitoredResource(String monitoredResource) {
            this.monitoredResource = Objects.requireNonNull(monitoredResource);
            return this;
        }

        public LoggingDestinationResponse build() {
            return new LoggingDestinationResponse(logs, monitoredResource);
        }
    }
}
