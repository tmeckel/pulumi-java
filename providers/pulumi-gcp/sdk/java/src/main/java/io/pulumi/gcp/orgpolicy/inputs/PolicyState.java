// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.orgpolicy.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.orgpolicy.inputs.PolicySpecGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyState extends io.pulumi.resources.ResourceArgs {

    public static final PolicyState Empty = new PolicyState();

    /**
     * Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number}/policies/{constraint_name}` * `folders/{folder_id}/policies/{constraint_name}` * `organizations/{organization_id}/policies/{constraint_name}` For example, "projects/123/policies/compute.disableSerialPortAccess". Note: `projects/{project_id}/policies/{constraint_name}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The parent of the resource.
     * 
     */
    @InputImport(name="parent")
      private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    /**
     * Basic information about the Organization Policy.
     * 
     */
    @InputImport(name="spec")
      private final @Nullable Input<PolicySpecGetArgs> spec;

    public Input<PolicySpecGetArgs> getSpec() {
        return this.spec == null ? Input.empty() : this.spec;
    }

    public PolicyState(
        @Nullable Input<String> name,
        @Nullable Input<String> parent,
        @Nullable Input<PolicySpecGetArgs> spec) {
        this.name = name;
        this.parent = parent;
        this.spec = spec;
    }

    private PolicyState() {
        this.name = Input.empty();
        this.parent = Input.empty();
        this.spec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> parent;
        private @Nullable Input<PolicySpecGetArgs> spec;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.spec = defaults.spec;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder parent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder parent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }

        public Builder spec(@Nullable Input<PolicySpecGetArgs> spec) {
            this.spec = spec;
            return this;
        }

        public Builder spec(@Nullable PolicySpecGetArgs spec) {
            this.spec = Input.ofNullable(spec);
            return this;
        }
        public PolicyState build() {
            return new PolicyState(name, parent, spec);
        }
    }
}
