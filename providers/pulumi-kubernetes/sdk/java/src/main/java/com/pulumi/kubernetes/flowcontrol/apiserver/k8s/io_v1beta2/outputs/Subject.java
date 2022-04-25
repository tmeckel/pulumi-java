// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs.GroupSubject;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs.ServiceAccountSubject;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs.UserSubject;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Subject {
    /**
     * @return `group` matches based on user group name.
     * 
     */
    private final @Nullable GroupSubject group;
    /**
     * @return `kind` indicates which one of the other fields is non-empty. Required
     * 
     */
    private final String kind;
    /**
     * @return `serviceAccount` matches ServiceAccounts.
     * 
     */
    private final @Nullable ServiceAccountSubject serviceAccount;
    /**
     * @return `user` matches based on username.
     * 
     */
    private final @Nullable UserSubject user;

    @CustomType.Constructor
    private Subject(
        @CustomType.Parameter("group") @Nullable GroupSubject group,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("serviceAccount") @Nullable ServiceAccountSubject serviceAccount,
        @CustomType.Parameter("user") @Nullable UserSubject user) {
        this.group = group;
        this.kind = kind;
        this.serviceAccount = serviceAccount;
        this.user = user;
    }

    /**
     * @return `group` matches based on user group name.
     * 
     */
    public Optional<GroupSubject> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * @return `kind` indicates which one of the other fields is non-empty. Required
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return `serviceAccount` matches ServiceAccounts.
     * 
     */
    public Optional<ServiceAccountSubject> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }
    /**
     * @return `user` matches based on username.
     * 
     */
    public Optional<UserSubject> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Subject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GroupSubject group;
        private String kind;
        private @Nullable ServiceAccountSubject serviceAccount;
        private @Nullable UserSubject user;

        public Builder() {
    	      // Empty
        }

        public Builder(Subject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.kind = defaults.kind;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.user = defaults.user;
        }

        public Builder group(@Nullable GroupSubject group) {
            this.group = group;
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder serviceAccount(@Nullable ServiceAccountSubject serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder user(@Nullable UserSubject user) {
            this.user = user;
            return this;
        }        public Subject build() {
            return new Subject(group, kind, serviceAccount, user);
        }
    }
}
