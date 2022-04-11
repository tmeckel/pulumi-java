// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The HANA DB Prometheus Exporter settings.
 * 
 */
public final class ApplicationHANAPrometheusExporterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationHANAPrometheusExporterArgs Empty = new ApplicationHANAPrometheusExporterArgs();

    /**
     * A flag which indicates agreeing to install SAP HANA DB client.
     * 
     */
    @Import(name="agreeToInstallHANADBClient", required=true)
      private final Output<Boolean> agreeToInstallHANADBClient;

    public Output<Boolean> getAgreeToInstallHANADBClient() {
        return this.agreeToInstallHANADBClient;
    }

    /**
     * The HANA DB port.
     * 
     */
    @Import(name="hANAPort", required=true)
      private final Output<String> hANAPort;

    public Output<String> getHANAPort() {
        return this.hANAPort;
    }

    /**
     * HANA DB SID.
     * 
     */
    @Import(name="hANASID", required=true)
      private final Output<String> hANASID;

    public Output<String> getHANASID() {
        return this.hANASID;
    }

    /**
     * The secret name which manages the HANA DB credentials e.g. {
     *   "username": "<>",
     *   "password": "<>"
     * }.
     * 
     */
    @Import(name="hANASecretName", required=true)
      private final Output<String> hANASecretName;

    public Output<String> getHANASecretName() {
        return this.hANASecretName;
    }

    /**
     * Prometheus exporter port.
     * 
     */
    @Import(name="prometheusPort")
      private final @Nullable Output<String> prometheusPort;

    public Output<String> getPrometheusPort() {
        return this.prometheusPort == null ? Codegen.empty() : this.prometheusPort;
    }

    public ApplicationHANAPrometheusExporterArgs(
        Output<Boolean> agreeToInstallHANADBClient,
        Output<String> hANAPort,
        Output<String> hANASID,
        Output<String> hANASecretName,
        @Nullable Output<String> prometheusPort) {
        this.agreeToInstallHANADBClient = Objects.requireNonNull(agreeToInstallHANADBClient, "expected parameter 'agreeToInstallHANADBClient' to be non-null");
        this.hANAPort = Objects.requireNonNull(hANAPort, "expected parameter 'hANAPort' to be non-null");
        this.hANASID = Objects.requireNonNull(hANASID, "expected parameter 'hANASID' to be non-null");
        this.hANASecretName = Objects.requireNonNull(hANASecretName, "expected parameter 'hANASecretName' to be non-null");
        this.prometheusPort = prometheusPort;
    }

    private ApplicationHANAPrometheusExporterArgs() {
        this.agreeToInstallHANADBClient = Codegen.empty();
        this.hANAPort = Codegen.empty();
        this.hANASID = Codegen.empty();
        this.hANASecretName = Codegen.empty();
        this.prometheusPort = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationHANAPrometheusExporterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> agreeToInstallHANADBClient;
        private Output<String> hANAPort;
        private Output<String> hANASID;
        private Output<String> hANASecretName;
        private @Nullable Output<String> prometheusPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationHANAPrometheusExporterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agreeToInstallHANADBClient = defaults.agreeToInstallHANADBClient;
    	      this.hANAPort = defaults.hANAPort;
    	      this.hANASID = defaults.hANASID;
    	      this.hANASecretName = defaults.hANASecretName;
    	      this.prometheusPort = defaults.prometheusPort;
        }

        public Builder agreeToInstallHANADBClient(Output<Boolean> agreeToInstallHANADBClient) {
            this.agreeToInstallHANADBClient = Objects.requireNonNull(agreeToInstallHANADBClient);
            return this;
        }
        public Builder agreeToInstallHANADBClient(Boolean agreeToInstallHANADBClient) {
            this.agreeToInstallHANADBClient = Output.of(Objects.requireNonNull(agreeToInstallHANADBClient));
            return this;
        }
        public Builder hANAPort(Output<String> hANAPort) {
            this.hANAPort = Objects.requireNonNull(hANAPort);
            return this;
        }
        public Builder hANAPort(String hANAPort) {
            this.hANAPort = Output.of(Objects.requireNonNull(hANAPort));
            return this;
        }
        public Builder hANASID(Output<String> hANASID) {
            this.hANASID = Objects.requireNonNull(hANASID);
            return this;
        }
        public Builder hANASID(String hANASID) {
            this.hANASID = Output.of(Objects.requireNonNull(hANASID));
            return this;
        }
        public Builder hANASecretName(Output<String> hANASecretName) {
            this.hANASecretName = Objects.requireNonNull(hANASecretName);
            return this;
        }
        public Builder hANASecretName(String hANASecretName) {
            this.hANASecretName = Output.of(Objects.requireNonNull(hANASecretName));
            return this;
        }
        public Builder prometheusPort(@Nullable Output<String> prometheusPort) {
            this.prometheusPort = prometheusPort;
            return this;
        }
        public Builder prometheusPort(@Nullable String prometheusPort) {
            this.prometheusPort = Codegen.ofNullable(prometheusPort);
            return this;
        }        public ApplicationHANAPrometheusExporterArgs build() {
            return new ApplicationHANAPrometheusExporterArgs(agreeToInstallHANADBClient, hANAPort, hANASID, hANASecretName, prometheusPort);
        }
    }
}
