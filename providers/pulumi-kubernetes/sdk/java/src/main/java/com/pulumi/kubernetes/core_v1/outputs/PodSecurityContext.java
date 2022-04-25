// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.SELinuxOptions;
import com.pulumi.kubernetes.core_v1.outputs.SeccompProfile;
import com.pulumi.kubernetes.core_v1.outputs.Sysctl;
import com.pulumi.kubernetes.core_v1.outputs.WindowsSecurityContextOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PodSecurityContext {
    /**
     * @return A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:
     * 
     * 1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR&#39;d with rw-rw----
     * 
     * If unset, the Kubelet will not modify the ownership and permissions of any volume. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private final @Nullable Integer fsGroup;
    /**
     * @return fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod. This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are &#34;OnRootMismatch&#34; and &#34;Always&#34;. If not specified, &#34;Always&#34; is used. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private final @Nullable String fsGroupChangePolicy;
    /**
     * @return The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private final @Nullable Integer runAsGroup;
    /**
     * @return Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    private final @Nullable Boolean runAsNonRoot;
    /**
     * @return The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private final @Nullable Integer runAsUser;
    /**
     * @return The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private final @Nullable SELinuxOptions seLinuxOptions;
    /**
     * @return The seccomp options to use by the containers in this pod. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private final @Nullable SeccompProfile seccompProfile;
    /**
     * @return A list of groups applied to the first process run in each container, in addition to the container&#39;s primary GID.  If unspecified, no groups will be added to any container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private final @Nullable List<Integer> supplementalGroups;
    /**
     * @return Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private final @Nullable List<Sysctl> sysctls;
    /**
     * @return The Windows specific settings applied to all containers. If unspecified, the options within a container&#39;s SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is linux.
     * 
     */
    private final @Nullable WindowsSecurityContextOptions windowsOptions;

    @CustomType.Constructor
    private PodSecurityContext(
        @CustomType.Parameter("fsGroup") @Nullable Integer fsGroup,
        @CustomType.Parameter("fsGroupChangePolicy") @Nullable String fsGroupChangePolicy,
        @CustomType.Parameter("runAsGroup") @Nullable Integer runAsGroup,
        @CustomType.Parameter("runAsNonRoot") @Nullable Boolean runAsNonRoot,
        @CustomType.Parameter("runAsUser") @Nullable Integer runAsUser,
        @CustomType.Parameter("seLinuxOptions") @Nullable SELinuxOptions seLinuxOptions,
        @CustomType.Parameter("seccompProfile") @Nullable SeccompProfile seccompProfile,
        @CustomType.Parameter("supplementalGroups") @Nullable List<Integer> supplementalGroups,
        @CustomType.Parameter("sysctls") @Nullable List<Sysctl> sysctls,
        @CustomType.Parameter("windowsOptions") @Nullable WindowsSecurityContextOptions windowsOptions) {
        this.fsGroup = fsGroup;
        this.fsGroupChangePolicy = fsGroupChangePolicy;
        this.runAsGroup = runAsGroup;
        this.runAsNonRoot = runAsNonRoot;
        this.runAsUser = runAsUser;
        this.seLinuxOptions = seLinuxOptions;
        this.seccompProfile = seccompProfile;
        this.supplementalGroups = supplementalGroups;
        this.sysctls = sysctls;
        this.windowsOptions = windowsOptions;
    }

    /**
     * @return A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:
     * 
     * 1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR&#39;d with rw-rw----
     * 
     * If unset, the Kubelet will not modify the ownership and permissions of any volume. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Optional<Integer> fsGroup() {
        return Optional.ofNullable(this.fsGroup);
    }
    /**
     * @return fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod. This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are &#34;OnRootMismatch&#34; and &#34;Always&#34;. If not specified, &#34;Always&#34; is used. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Optional<String> fsGroupChangePolicy() {
        return Optional.ofNullable(this.fsGroupChangePolicy);
    }
    /**
     * @return The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Optional<Integer> runAsGroup() {
        return Optional.ofNullable(this.runAsGroup);
    }
    /**
     * @return Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    public Optional<Boolean> runAsNonRoot() {
        return Optional.ofNullable(this.runAsNonRoot);
    }
    /**
     * @return The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Optional<Integer> runAsUser() {
        return Optional.ofNullable(this.runAsUser);
    }
    /**
     * @return The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Optional<SELinuxOptions> seLinuxOptions() {
        return Optional.ofNullable(this.seLinuxOptions);
    }
    /**
     * @return The seccomp options to use by the containers in this pod. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public Optional<SeccompProfile> seccompProfile() {
        return Optional.ofNullable(this.seccompProfile);
    }
    /**
     * @return A list of groups applied to the first process run in each container, in addition to the container&#39;s primary GID.  If unspecified, no groups will be added to any container. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public List<Integer> supplementalGroups() {
        return this.supplementalGroups == null ? List.of() : this.supplementalGroups;
    }
    /**
     * @return Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    public List<Sysctl> sysctls() {
        return this.sysctls == null ? List.of() : this.sysctls;
    }
    /**
     * @return The Windows specific settings applied to all containers. If unspecified, the options within a container&#39;s SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is linux.
     * 
     */
    public Optional<WindowsSecurityContextOptions> windowsOptions() {
        return Optional.ofNullable(this.windowsOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodSecurityContext defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer fsGroup;
        private @Nullable String fsGroupChangePolicy;
        private @Nullable Integer runAsGroup;
        private @Nullable Boolean runAsNonRoot;
        private @Nullable Integer runAsUser;
        private @Nullable SELinuxOptions seLinuxOptions;
        private @Nullable SeccompProfile seccompProfile;
        private @Nullable List<Integer> supplementalGroups;
        private @Nullable List<Sysctl> sysctls;
        private @Nullable WindowsSecurityContextOptions windowsOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(PodSecurityContext defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsGroup = defaults.fsGroup;
    	      this.fsGroupChangePolicy = defaults.fsGroupChangePolicy;
    	      this.runAsGroup = defaults.runAsGroup;
    	      this.runAsNonRoot = defaults.runAsNonRoot;
    	      this.runAsUser = defaults.runAsUser;
    	      this.seLinuxOptions = defaults.seLinuxOptions;
    	      this.seccompProfile = defaults.seccompProfile;
    	      this.supplementalGroups = defaults.supplementalGroups;
    	      this.sysctls = defaults.sysctls;
    	      this.windowsOptions = defaults.windowsOptions;
        }

        public Builder fsGroup(@Nullable Integer fsGroup) {
            this.fsGroup = fsGroup;
            return this;
        }
        public Builder fsGroupChangePolicy(@Nullable String fsGroupChangePolicy) {
            this.fsGroupChangePolicy = fsGroupChangePolicy;
            return this;
        }
        public Builder runAsGroup(@Nullable Integer runAsGroup) {
            this.runAsGroup = runAsGroup;
            return this;
        }
        public Builder runAsNonRoot(@Nullable Boolean runAsNonRoot) {
            this.runAsNonRoot = runAsNonRoot;
            return this;
        }
        public Builder runAsUser(@Nullable Integer runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Builder seLinuxOptions(@Nullable SELinuxOptions seLinuxOptions) {
            this.seLinuxOptions = seLinuxOptions;
            return this;
        }
        public Builder seccompProfile(@Nullable SeccompProfile seccompProfile) {
            this.seccompProfile = seccompProfile;
            return this;
        }
        public Builder supplementalGroups(@Nullable List<Integer> supplementalGroups) {
            this.supplementalGroups = supplementalGroups;
            return this;
        }
        public Builder supplementalGroups(Integer... supplementalGroups) {
            return supplementalGroups(List.of(supplementalGroups));
        }
        public Builder sysctls(@Nullable List<Sysctl> sysctls) {
            this.sysctls = sysctls;
            return this;
        }
        public Builder sysctls(Sysctl... sysctls) {
            return sysctls(List.of(sysctls));
        }
        public Builder windowsOptions(@Nullable WindowsSecurityContextOptions windowsOptions) {
            this.windowsOptions = windowsOptions;
            return this;
        }        public PodSecurityContext build() {
            return new PodSecurityContext(fsGroup, fsGroupChangePolicy, runAsGroup, runAsNonRoot, runAsUser, seLinuxOptions, seccompProfile, supplementalGroups, sysctls, windowsOptions);
        }
    }
}
