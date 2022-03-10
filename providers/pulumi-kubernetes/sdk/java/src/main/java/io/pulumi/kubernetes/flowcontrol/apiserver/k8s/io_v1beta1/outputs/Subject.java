// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.outputs.GroupSubject;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.outputs.ServiceAccountSubject;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.outputs.UserSubject;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Subject {
    /**
     * `group` matches based on user group name.
     * 
     */
    private final @Nullable GroupSubject group;
    /**
     * `kind` indicates which one of the other fields is non-empty. Required
     * 
     */
    private final String kind;
    /**
     * `serviceAccount` matches ServiceAccounts.
     * 
     */
    private final @Nullable ServiceAccountSubject serviceAccount;
    /**
     * `user` matches based on username.
     * 
     */
    private final @Nullable UserSubject user;

    @OutputCustomType.Constructor
    private Subject(
        @OutputCustomType.Parameter("group") @Nullable GroupSubject group,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("serviceAccount") @Nullable ServiceAccountSubject serviceAccount,
        @OutputCustomType.Parameter("user") @Nullable UserSubject user) {
        this.group = group;
        this.kind = kind;
        this.serviceAccount = serviceAccount;
        this.user = user;
    }

    /**
     * `group` matches based on user group name.
     * 
    */
    public Optional<GroupSubject> getGroup() {
        return Optional.ofNullable(this.group);
    }
    /**
     * `kind` indicates which one of the other fields is non-empty. Required
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * `serviceAccount` matches ServiceAccounts.
     * 
    */
    public Optional<ServiceAccountSubject> getServiceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }
    /**
     * `user` matches based on username.
     * 
    */
    public Optional<UserSubject> getUser() {
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
        }
        public Subject build() {
            return new Subject(group, kind, serviceAccount, user);
        }
    }
}
