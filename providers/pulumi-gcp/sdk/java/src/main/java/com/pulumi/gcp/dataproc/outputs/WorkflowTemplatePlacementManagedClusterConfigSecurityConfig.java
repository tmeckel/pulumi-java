// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfig;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplatePlacementManagedClusterConfigSecurityConfig {
    /**
     * @return Kerberos related configuration.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfig kerberosConfig;

    @CustomType.Constructor
    private WorkflowTemplatePlacementManagedClusterConfigSecurityConfig(@CustomType.Parameter("kerberosConfig") @Nullable WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfig kerberosConfig) {
        this.kerberosConfig = kerberosConfig;
    }

    /**
     * @return Kerberos related configuration.
     * 
     */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfig> kerberosConfig() {
        return Optional.ofNullable(this.kerberosConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigSecurityConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfig kerberosConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigSecurityConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kerberosConfig = defaults.kerberosConfig;
        }

        public Builder kerberosConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfig kerberosConfig) {
            this.kerberosConfig = kerberosConfig;
            return this;
        }        public WorkflowTemplatePlacementManagedClusterConfigSecurityConfig build() {
            return new WorkflowTemplatePlacementManagedClusterConfigSecurityConfig(kerberosConfig);
        }
    }
}
