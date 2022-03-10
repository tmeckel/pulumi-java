// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GcpUserAccessBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final GcpUserAccessBindingArgs Empty = new GcpUserAccessBindingArgs();

    /**
     * Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: "accessPolicies/9522/accessLevels/device_trusted"
     * 
     */
    @InputImport(name="accessLevels", required=true)
      private final Input<List<String>> accessLevels;

    public Input<List<String>> getAccessLevels() {
        return this.accessLevels;
    }

    /**
     * Immutable. Google Group id whose members are subject to this binding's restrictions. See "id" in the [G Suite Directory API's Groups resource] (https://developers.google.com/admin-sdk/directory/v1/reference/groups#resource). If a group's email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: "01d520gv4vjcrht"
     * 
     */
    @InputImport(name="groupKey", required=true)
      private final Input<String> groupKey;

    public Input<String> getGroupKey() {
        return this.groupKey;
    }

    /**
     * Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved characters (as defined by [RFC 3986 Section 2.3](https://tools.ietf.org/html/rfc3986#section-2.3)). Should not be specified by the client during creation. Example: "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="organizationId", required=true)
      private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    public GcpUserAccessBindingArgs(
        Input<List<String>> accessLevels,
        Input<String> groupKey,
        @Nullable Input<String> name,
        Input<String> organizationId) {
        this.accessLevels = Objects.requireNonNull(accessLevels, "expected parameter 'accessLevels' to be non-null");
        this.groupKey = Objects.requireNonNull(groupKey, "expected parameter 'groupKey' to be non-null");
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GcpUserAccessBindingArgs() {
        this.accessLevels = Input.empty();
        this.groupKey = Input.empty();
        this.name = Input.empty();
        this.organizationId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcpUserAccessBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> accessLevels;
        private Input<String> groupKey;
        private @Nullable Input<String> name;
        private Input<String> organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GcpUserAccessBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevels = defaults.accessLevels;
    	      this.groupKey = defaults.groupKey;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder accessLevels(Input<List<String>> accessLevels) {
            this.accessLevels = Objects.requireNonNull(accessLevels);
            return this;
        }

        public Builder accessLevels(List<String> accessLevels) {
            this.accessLevels = Input.of(Objects.requireNonNull(accessLevels));
            return this;
        }

        public Builder groupKey(Input<String> groupKey) {
            this.groupKey = Objects.requireNonNull(groupKey);
            return this;
        }

        public Builder groupKey(String groupKey) {
            this.groupKey = Input.of(Objects.requireNonNull(groupKey));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder organizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }
        public GcpUserAccessBindingArgs build() {
            return new GcpUserAccessBindingArgs(accessLevels, groupKey, name, organizationId);
        }
    }
}
