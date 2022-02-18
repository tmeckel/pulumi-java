// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ManagedZoneCloudLoggingConfigResponse {
    /**
     * If set, enable query logging for this ManagedZone. False by default, making logging opt-in.
     * 
     */
    private final Boolean enableLogging;
    private final String kind;

    @OutputCustomType.Constructor({"enableLogging","kind"})
    private ManagedZoneCloudLoggingConfigResponse(
        Boolean enableLogging,
        String kind) {
        this.enableLogging = Objects.requireNonNull(enableLogging);
        this.kind = Objects.requireNonNull(kind);
    }

    /**
     * If set, enable query logging for this ManagedZone. False by default, making logging opt-in.
     * 
     */
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }
    public String getKind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneCloudLoggingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableLogging;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneCloudLoggingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableLogging = defaults.enableLogging;
    	      this.kind = defaults.kind;
        }

        public Builder setEnableLogging(Boolean enableLogging) {
            this.enableLogging = Objects.requireNonNull(enableLogging);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public ManagedZoneCloudLoggingConfigResponse build() {
            return new ManagedZoneCloudLoggingConfigResponse(enableLogging, kind);
        }
    }
}
