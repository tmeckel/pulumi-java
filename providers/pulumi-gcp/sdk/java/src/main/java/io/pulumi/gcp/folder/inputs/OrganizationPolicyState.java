// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.folder.inputs.OrganizationPolicyBooleanPolicyGetArgs;
import io.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyGetArgs;
import io.pulumi.gcp.folder.inputs.OrganizationPolicyRestorePolicyGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationPolicyState Empty = new OrganizationPolicyState();

    /**
     * A boolean policy is a constraint that is either enforced or not. Structure is documented below.
     * 
     */
    @Import(name="booleanPolicy")
      private final @Nullable Output<OrganizationPolicyBooleanPolicyGetArgs> booleanPolicy;

    public Output<OrganizationPolicyBooleanPolicyGetArgs> getBooleanPolicy() {
        return this.booleanPolicy == null ? Codegen.empty() : this.booleanPolicy;
    }

    /**
     * The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
     * 
     */
    @Import(name="constraint")
      private final @Nullable Output<String> constraint;

    public Output<String> getConstraint() {
        return this.constraint == null ? Codegen.empty() : this.constraint;
    }

    /**
     * (Computed) The etag of the organization policy. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * The resource name of the folder to set the policy for. Its format is folders/{folder_id}.
     * 
     */
    @Import(name="folder")
      private final @Nullable Output<String> folder;

    public Output<String> getFolder() {
        return this.folder == null ? Codegen.empty() : this.folder;
    }

    /**
     * A policy that can define specific values that are allowed or denied for the given constraint. It
     * can also be used to allow or deny all values. Structure is documented below.
     * 
     */
    @Import(name="listPolicy")
      private final @Nullable Output<OrganizationPolicyListPolicyGetArgs> listPolicy;

    public Output<OrganizationPolicyListPolicyGetArgs> getListPolicy() {
        return this.listPolicy == null ? Codegen.empty() : this.listPolicy;
    }

    /**
     * A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     */
    @Import(name="restorePolicy")
      private final @Nullable Output<OrganizationPolicyRestorePolicyGetArgs> restorePolicy;

    public Output<OrganizationPolicyRestorePolicyGetArgs> getRestorePolicy() {
        return this.restorePolicy == null ? Codegen.empty() : this.restorePolicy;
    }

    /**
     * (Computed) The timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds, representing when the variable was last updated. Example: "2016-10-09T12:33:37.578138407Z".
     * 
     */
    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime == null ? Codegen.empty() : this.updateTime;
    }

    /**
     * Version of the Policy. Default version is 0.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<Integer> version;

    public Output<Integer> getVersion() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public OrganizationPolicyState(
        @Nullable Output<OrganizationPolicyBooleanPolicyGetArgs> booleanPolicy,
        @Nullable Output<String> constraint,
        @Nullable Output<String> etag,
        @Nullable Output<String> folder,
        @Nullable Output<OrganizationPolicyListPolicyGetArgs> listPolicy,
        @Nullable Output<OrganizationPolicyRestorePolicyGetArgs> restorePolicy,
        @Nullable Output<String> updateTime,
        @Nullable Output<Integer> version) {
        this.booleanPolicy = booleanPolicy;
        this.constraint = constraint;
        this.etag = etag;
        this.folder = folder;
        this.listPolicy = listPolicy;
        this.restorePolicy = restorePolicy;
        this.updateTime = updateTime;
        this.version = version;
    }

    private OrganizationPolicyState() {
        this.booleanPolicy = Codegen.empty();
        this.constraint = Codegen.empty();
        this.etag = Codegen.empty();
        this.folder = Codegen.empty();
        this.listPolicy = Codegen.empty();
        this.restorePolicy = Codegen.empty();
        this.updateTime = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<OrganizationPolicyBooleanPolicyGetArgs> booleanPolicy;
        private @Nullable Output<String> constraint;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> folder;
        private @Nullable Output<OrganizationPolicyListPolicyGetArgs> listPolicy;
        private @Nullable Output<OrganizationPolicyRestorePolicyGetArgs> restorePolicy;
        private @Nullable Output<String> updateTime;
        private @Nullable Output<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanPolicy = defaults.booleanPolicy;
    	      this.constraint = defaults.constraint;
    	      this.etag = defaults.etag;
    	      this.folder = defaults.folder;
    	      this.listPolicy = defaults.listPolicy;
    	      this.restorePolicy = defaults.restorePolicy;
    	      this.updateTime = defaults.updateTime;
    	      this.version = defaults.version;
        }

        public Builder booleanPolicy(@Nullable Output<OrganizationPolicyBooleanPolicyGetArgs> booleanPolicy) {
            this.booleanPolicy = booleanPolicy;
            return this;
        }
        public Builder booleanPolicy(@Nullable OrganizationPolicyBooleanPolicyGetArgs booleanPolicy) {
            this.booleanPolicy = Codegen.ofNullable(booleanPolicy);
            return this;
        }
        public Builder constraint(@Nullable Output<String> constraint) {
            this.constraint = constraint;
            return this;
        }
        public Builder constraint(@Nullable String constraint) {
            this.constraint = Codegen.ofNullable(constraint);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder folder(@Nullable Output<String> folder) {
            this.folder = folder;
            return this;
        }
        public Builder folder(@Nullable String folder) {
            this.folder = Codegen.ofNullable(folder);
            return this;
        }
        public Builder listPolicy(@Nullable Output<OrganizationPolicyListPolicyGetArgs> listPolicy) {
            this.listPolicy = listPolicy;
            return this;
        }
        public Builder listPolicy(@Nullable OrganizationPolicyListPolicyGetArgs listPolicy) {
            this.listPolicy = Codegen.ofNullable(listPolicy);
            return this;
        }
        public Builder restorePolicy(@Nullable Output<OrganizationPolicyRestorePolicyGetArgs> restorePolicy) {
            this.restorePolicy = restorePolicy;
            return this;
        }
        public Builder restorePolicy(@Nullable OrganizationPolicyRestorePolicyGetArgs restorePolicy) {
            this.restorePolicy = Codegen.ofNullable(restorePolicy);
            return this;
        }
        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Codegen.ofNullable(updateTime);
            return this;
        }
        public Builder version(@Nullable Output<Integer> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable Integer version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public OrganizationPolicyState build() {
            return new OrganizationPolicyState(booleanPolicy, constraint, etag, folder, listPolicy, restorePolicy, updateTime, version);
        }
    }
}
