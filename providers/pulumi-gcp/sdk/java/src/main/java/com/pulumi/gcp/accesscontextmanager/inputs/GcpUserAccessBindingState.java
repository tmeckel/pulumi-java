// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GcpUserAccessBindingState extends com.pulumi.resources.ResourceArgs {

    public static final GcpUserAccessBindingState Empty = new GcpUserAccessBindingState();

    /**
     * Required. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: &#34;accessPolicies/9522/accessLevels/device_trusted&#34;
     * 
     */
    @Import(name="accessLevels")
    private @Nullable Output<String> accessLevels;

    /**
     * @return Required. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: &#34;accessPolicies/9522/accessLevels/device_trusted&#34;
     * 
     */
    public Optional<Output<String>> accessLevels() {
        return Optional.ofNullable(this.accessLevels);
    }

    /**
     * Required. Immutable. Google Group id whose members are subject to this binding&#39;s restrictions. See &#34;id&#34; in the G Suite Directory API&#39;s Groups resource. If a group&#39;s email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: &#34;01d520gv4vjcrht&#34;
     * 
     */
    @Import(name="groupKey")
    private @Nullable Output<String> groupKey;

    /**
     * @return Required. Immutable. Google Group id whose members are subject to this binding&#39;s restrictions. See &#34;id&#34; in the G Suite Directory API&#39;s Groups resource. If a group&#39;s email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: &#34;01d520gv4vjcrht&#34;
     * 
     */
    public Optional<Output<String>> groupKey() {
        return Optional.ofNullable(this.groupKey);
    }

    /**
     * Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved
     * characters (as defined by RFC 3986 Section 2.3). Should not be specified by the client during creation. Example:
     * &#34;organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N&#34;
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved
     * characters (as defined by RFC 3986 Section 2.3). Should not be specified by the client during creation. Example:
     * &#34;organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N&#34;
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Required. ID of the parent organization.
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return Required. ID of the parent organization.
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    private GcpUserAccessBindingState() {}

    private GcpUserAccessBindingState(GcpUserAccessBindingState $) {
        this.accessLevels = $.accessLevels;
        this.groupKey = $.groupKey;
        this.name = $.name;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcpUserAccessBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcpUserAccessBindingState $;

        public Builder() {
            $ = new GcpUserAccessBindingState();
        }

        public Builder(GcpUserAccessBindingState defaults) {
            $ = new GcpUserAccessBindingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLevels Required. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: &#34;accessPolicies/9522/accessLevels/device_trusted&#34;
         * 
         * @return builder
         * 
         */
        public Builder accessLevels(@Nullable Output<String> accessLevels) {
            $.accessLevels = accessLevels;
            return this;
        }

        /**
         * @param accessLevels Required. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: &#34;accessPolicies/9522/accessLevels/device_trusted&#34;
         * 
         * @return builder
         * 
         */
        public Builder accessLevels(String accessLevels) {
            return accessLevels(Output.of(accessLevels));
        }

        /**
         * @param groupKey Required. Immutable. Google Group id whose members are subject to this binding&#39;s restrictions. See &#34;id&#34; in the G Suite Directory API&#39;s Groups resource. If a group&#39;s email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: &#34;01d520gv4vjcrht&#34;
         * 
         * @return builder
         * 
         */
        public Builder groupKey(@Nullable Output<String> groupKey) {
            $.groupKey = groupKey;
            return this;
        }

        /**
         * @param groupKey Required. Immutable. Google Group id whose members are subject to this binding&#39;s restrictions. See &#34;id&#34; in the G Suite Directory API&#39;s Groups resource. If a group&#39;s email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: &#34;01d520gv4vjcrht&#34;
         * 
         * @return builder
         * 
         */
        public Builder groupKey(String groupKey) {
            return groupKey(Output.of(groupKey));
        }

        /**
         * @param name Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved
         * characters (as defined by RFC 3986 Section 2.3). Should not be specified by the client during creation. Example:
         * &#34;organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved
         * characters (as defined by RFC 3986 Section 2.3). Should not be specified by the client during creation. Example:
         * &#34;organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organizationId Required. ID of the parent organization.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId Required. ID of the parent organization.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public GcpUserAccessBindingState build() {
            return $;
        }
    }

}
