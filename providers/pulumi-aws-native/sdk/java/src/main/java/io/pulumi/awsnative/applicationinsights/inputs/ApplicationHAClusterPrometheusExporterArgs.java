// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The HA cluster Prometheus Exporter settings.
 * 
 */
public final class ApplicationHAClusterPrometheusExporterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationHAClusterPrometheusExporterArgs Empty = new ApplicationHAClusterPrometheusExporterArgs();

    /**
     * Prometheus exporter port.
     * 
     */
    @Import(name="prometheusPort")
      private final @Nullable Output<String> prometheusPort;

    public Output<String> getPrometheusPort() {
        return this.prometheusPort == null ? Codegen.empty() : this.prometheusPort;
    }

    public ApplicationHAClusterPrometheusExporterArgs(@Nullable Output<String> prometheusPort) {
        this.prometheusPort = prometheusPort;
    }

    private ApplicationHAClusterPrometheusExporterArgs() {
        this.prometheusPort = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationHAClusterPrometheusExporterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> prometheusPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationHAClusterPrometheusExporterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prometheusPort = defaults.prometheusPort;
        }

        public Builder prometheusPort(@Nullable Output<String> prometheusPort) {
            this.prometheusPort = prometheusPort;
            return this;
        }
        public Builder prometheusPort(@Nullable String prometheusPort) {
            this.prometheusPort = Codegen.ofNullable(prometheusPort);
            return this;
        }        public ApplicationHAClusterPrometheusExporterArgs build() {
            return new ApplicationHAClusterPrometheusExporterArgs(prometheusPort);
        }
    }
}
