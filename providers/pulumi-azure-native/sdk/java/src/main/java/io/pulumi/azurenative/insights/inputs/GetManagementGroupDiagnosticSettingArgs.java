// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetManagementGroupDiagnosticSettingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetManagementGroupDiagnosticSettingArgs Empty = new GetManagementGroupDiagnosticSettingArgs();

    /**
     * The management group id.
     * 
     */
    @InputImport(name="managementGroupId", required=true)
      private final String managementGroupId;

    public String getManagementGroupId() {
        return this.managementGroupId;
    }

    /**
     * The name of the diagnostic setting.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public GetManagementGroupDiagnosticSettingArgs(
        String managementGroupId,
        String name) {
        this.managementGroupId = Objects.requireNonNull(managementGroupId, "expected parameter 'managementGroupId' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GetManagementGroupDiagnosticSettingArgs() {
        this.managementGroupId = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagementGroupDiagnosticSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managementGroupId;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagementGroupDiagnosticSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managementGroupId = defaults.managementGroupId;
    	      this.name = defaults.name;
        }

        public Builder managementGroupId(String managementGroupId) {
            this.managementGroupId = Objects.requireNonNull(managementGroupId);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetManagementGroupDiagnosticSettingArgs build() {
            return new GetManagementGroupDiagnosticSettingArgs(managementGroupId, name);
        }
    }
}
