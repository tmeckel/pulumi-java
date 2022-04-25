// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.shield.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProtectionGroupState extends com.pulumi.resources.ResourceArgs {

    public static final ProtectionGroupState Empty = new ProtectionGroupState();

    /**
     * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
     * 
     */
    @Import(name="aggregation")
    private @Nullable Output<String> aggregation;

    /**
     * @return Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
     * 
     */
    public Optional<Output<String>> aggregation() {
        return Optional.ofNullable(this.aggregation);
    }

    /**
     * The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
     * 
     */
    @Import(name="members")
    private @Nullable Output<List<String>> members;

    /**
     * @return The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
     * 
     */
    public Optional<Output<List<String>>> members() {
        return Optional.ofNullable(this.members);
    }

    /**
     * The criteria to use to choose the protected resources for inclusion in the group.
     * 
     */
    @Import(name="pattern")
    private @Nullable Output<String> pattern;

    /**
     * @return The criteria to use to choose the protected resources for inclusion in the group.
     * 
     */
    public Optional<Output<String>> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    /**
     * The ARN (Amazon Resource Name) of the protection group.
     * 
     */
    @Import(name="protectionGroupArn")
    private @Nullable Output<String> protectionGroupArn;

    /**
     * @return The ARN (Amazon Resource Name) of the protection group.
     * 
     */
    public Optional<Output<String>> protectionGroupArn() {
        return Optional.ofNullable(this.protectionGroupArn);
    }

    /**
     * The name of the protection group.
     * 
     */
    @Import(name="protectionGroupId")
    private @Nullable Output<String> protectionGroupId;

    /**
     * @return The name of the protection group.
     * 
     */
    public Optional<Output<String>> protectionGroupId() {
        return Optional.ofNullable(this.protectionGroupId);
    }

    /**
     * The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private ProtectionGroupState() {}

    private ProtectionGroupState(ProtectionGroupState $) {
        this.aggregation = $.aggregation;
        this.members = $.members;
        this.pattern = $.pattern;
        this.protectionGroupArn = $.protectionGroupArn;
        this.protectionGroupId = $.protectionGroupId;
        this.resourceType = $.resourceType;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProtectionGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProtectionGroupState $;

        public Builder() {
            $ = new ProtectionGroupState();
        }

        public Builder(ProtectionGroupState defaults) {
            $ = new ProtectionGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregation Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
         * 
         * @return builder
         * 
         */
        public Builder aggregation(@Nullable Output<String> aggregation) {
            $.aggregation = aggregation;
            return this;
        }

        /**
         * @param aggregation Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
         * 
         * @return builder
         * 
         */
        public Builder aggregation(String aggregation) {
            return aggregation(Output.of(aggregation));
        }

        /**
         * @param members The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
         * 
         * @return builder
         * 
         */
        public Builder members(@Nullable Output<List<String>> members) {
            $.members = members;
            return this;
        }

        /**
         * @param members The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
         * 
         * @return builder
         * 
         */
        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        /**
         * @param members The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
         * 
         * @return builder
         * 
         */
        public Builder members(String... members) {
            return members(List.of(members));
        }

        /**
         * @param pattern The criteria to use to choose the protected resources for inclusion in the group.
         * 
         * @return builder
         * 
         */
        public Builder pattern(@Nullable Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        /**
         * @param pattern The criteria to use to choose the protected resources for inclusion in the group.
         * 
         * @return builder
         * 
         */
        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        /**
         * @param protectionGroupArn The ARN (Amazon Resource Name) of the protection group.
         * 
         * @return builder
         * 
         */
        public Builder protectionGroupArn(@Nullable Output<String> protectionGroupArn) {
            $.protectionGroupArn = protectionGroupArn;
            return this;
        }

        /**
         * @param protectionGroupArn The ARN (Amazon Resource Name) of the protection group.
         * 
         * @return builder
         * 
         */
        public Builder protectionGroupArn(String protectionGroupArn) {
            return protectionGroupArn(Output.of(protectionGroupArn));
        }

        /**
         * @param protectionGroupId The name of the protection group.
         * 
         * @return builder
         * 
         */
        public Builder protectionGroupId(@Nullable Output<String> protectionGroupId) {
            $.protectionGroupId = protectionGroupId;
            return this;
        }

        /**
         * @param protectionGroupId The name of the protection group.
         * 
         * @return builder
         * 
         */
        public Builder protectionGroupId(String protectionGroupId) {
            return protectionGroupId(Output.of(protectionGroupId));
        }

        /**
         * @param resourceType The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public ProtectionGroupState build() {
            return $;
        }
    }

}
