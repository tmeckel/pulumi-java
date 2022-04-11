// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.authorization.k8s.io_v1.inputs.NonResourceAttributesArgs;
import io.pulumi.kubernetes.authorization.k8s.io_v1.inputs.ResourceAttributesArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 * 
 */
public final class SubjectAccessReviewSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubjectAccessReviewSpecArgs Empty = new SubjectAccessReviewSpecArgs();

    /**
     * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
     * 
     */
    @Import(name="extra")
      private final @Nullable Output<Map<String,List<String>>> extra;

    public Output<Map<String,List<String>>> getExtra() {
        return this.extra == null ? Codegen.empty() : this.extra;
    }

    /**
     * Groups is the groups you're testing for.
     * 
     */
    @Import(name="groups")
      private final @Nullable Output<List<String>> groups;

    public Output<List<String>> getGroups() {
        return this.groups == null ? Codegen.empty() : this.groups;
    }

    /**
     * NonResourceAttributes describes information for a non-resource access request
     * 
     */
    @Import(name="nonResourceAttributes")
      private final @Nullable Output<NonResourceAttributesArgs> nonResourceAttributes;

    public Output<NonResourceAttributesArgs> getNonResourceAttributes() {
        return this.nonResourceAttributes == null ? Codegen.empty() : this.nonResourceAttributes;
    }

    /**
     * ResourceAuthorizationAttributes describes information for a resource access request
     * 
     */
    @Import(name="resourceAttributes")
      private final @Nullable Output<ResourceAttributesArgs> resourceAttributes;

    public Output<ResourceAttributesArgs> getResourceAttributes() {
        return this.resourceAttributes == null ? Codegen.empty() : this.resourceAttributes;
    }

    /**
     * UID information about the requesting user.
     * 
     */
    @Import(name="uid")
      private final @Nullable Output<String> uid;

    public Output<String> getUid() {
        return this.uid == null ? Codegen.empty() : this.uid;
    }

    /**
     * User is the user you're testing for. If you specify "User" but not "Groups", then is it interpreted as "What if User were not a member of any groups
     * 
     */
    @Import(name="user")
      private final @Nullable Output<String> user;

    public Output<String> getUser() {
        return this.user == null ? Codegen.empty() : this.user;
    }

    public SubjectAccessReviewSpecArgs(
        @Nullable Output<Map<String,List<String>>> extra,
        @Nullable Output<List<String>> groups,
        @Nullable Output<NonResourceAttributesArgs> nonResourceAttributes,
        @Nullable Output<ResourceAttributesArgs> resourceAttributes,
        @Nullable Output<String> uid,
        @Nullable Output<String> user) {
        this.extra = extra;
        this.groups = groups;
        this.nonResourceAttributes = nonResourceAttributes;
        this.resourceAttributes = resourceAttributes;
        this.uid = uid;
        this.user = user;
    }

    private SubjectAccessReviewSpecArgs() {
        this.extra = Codegen.empty();
        this.groups = Codegen.empty();
        this.nonResourceAttributes = Codegen.empty();
        this.resourceAttributes = Codegen.empty();
        this.uid = Codegen.empty();
        this.user = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectAccessReviewSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,List<String>>> extra;
        private @Nullable Output<List<String>> groups;
        private @Nullable Output<NonResourceAttributesArgs> nonResourceAttributes;
        private @Nullable Output<ResourceAttributesArgs> resourceAttributes;
        private @Nullable Output<String> uid;
        private @Nullable Output<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectAccessReviewSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extra = defaults.extra;
    	      this.groups = defaults.groups;
    	      this.nonResourceAttributes = defaults.nonResourceAttributes;
    	      this.resourceAttributes = defaults.resourceAttributes;
    	      this.uid = defaults.uid;
    	      this.user = defaults.user;
        }

        public Builder extra(@Nullable Output<Map<String,List<String>>> extra) {
            this.extra = extra;
            return this;
        }
        public Builder extra(@Nullable Map<String,List<String>> extra) {
            this.extra = Codegen.ofNullable(extra);
            return this;
        }
        public Builder groups(@Nullable Output<List<String>> groups) {
            this.groups = groups;
            return this;
        }
        public Builder groups(@Nullable List<String> groups) {
            this.groups = Codegen.ofNullable(groups);
            return this;
        }
        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }
        public Builder nonResourceAttributes(@Nullable Output<NonResourceAttributesArgs> nonResourceAttributes) {
            this.nonResourceAttributes = nonResourceAttributes;
            return this;
        }
        public Builder nonResourceAttributes(@Nullable NonResourceAttributesArgs nonResourceAttributes) {
            this.nonResourceAttributes = Codegen.ofNullable(nonResourceAttributes);
            return this;
        }
        public Builder resourceAttributes(@Nullable Output<ResourceAttributesArgs> resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }
        public Builder resourceAttributes(@Nullable ResourceAttributesArgs resourceAttributes) {
            this.resourceAttributes = Codegen.ofNullable(resourceAttributes);
            return this;
        }
        public Builder uid(@Nullable Output<String> uid) {
            this.uid = uid;
            return this;
        }
        public Builder uid(@Nullable String uid) {
            this.uid = Codegen.ofNullable(uid);
            return this;
        }
        public Builder user(@Nullable Output<String> user) {
            this.user = user;
            return this;
        }
        public Builder user(@Nullable String user) {
            this.user = Codegen.ofNullable(user);
            return this;
        }        public SubjectAccessReviewSpecArgs build() {
            return new SubjectAccessReviewSpecArgs(extra, groups, nonResourceAttributes, resourceAttributes, uid, user);
        }
    }
}
