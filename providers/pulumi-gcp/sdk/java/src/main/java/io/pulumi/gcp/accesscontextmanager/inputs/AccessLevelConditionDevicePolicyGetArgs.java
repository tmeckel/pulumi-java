// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyOsConstraintGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessLevelConditionDevicePolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelConditionDevicePolicyGetArgs Empty = new AccessLevelConditionDevicePolicyGetArgs();

    /**
     * A list of allowed device management levels.
     * An empty list allows all management levels.
     * Each value may be one of `MANAGEMENT_UNSPECIFIED`, `NONE`, `BASIC`, and `COMPLETE`.
     * 
     */
    @Import(name="allowedDeviceManagementLevels")
      private final @Nullable Output<List<String>> allowedDeviceManagementLevels;

    public Output<List<String>> getAllowedDeviceManagementLevels() {
        return this.allowedDeviceManagementLevels == null ? Codegen.empty() : this.allowedDeviceManagementLevels;
    }

    /**
     * A list of allowed encryptions statuses.
     * An empty list allows all statuses.
     * Each value may be one of `ENCRYPTION_UNSPECIFIED`, `ENCRYPTION_UNSUPPORTED`, `UNENCRYPTED`, and `ENCRYPTED`.
     * 
     */
    @Import(name="allowedEncryptionStatuses")
      private final @Nullable Output<List<String>> allowedEncryptionStatuses;

    public Output<List<String>> getAllowedEncryptionStatuses() {
        return this.allowedEncryptionStatuses == null ? Codegen.empty() : this.allowedEncryptionStatuses;
    }

    /**
     * A list of allowed OS versions.
     * An empty list allows all types and all versions.
     * Structure is documented below.
     * 
     */
    @Import(name="osConstraints")
      private final @Nullable Output<List<AccessLevelConditionDevicePolicyOsConstraintGetArgs>> osConstraints;

    public Output<List<AccessLevelConditionDevicePolicyOsConstraintGetArgs>> getOsConstraints() {
        return this.osConstraints == null ? Codegen.empty() : this.osConstraints;
    }

    /**
     * Whether the device needs to be approved by the customer admin.
     * 
     */
    @Import(name="requireAdminApproval")
      private final @Nullable Output<Boolean> requireAdminApproval;

    public Output<Boolean> getRequireAdminApproval() {
        return this.requireAdminApproval == null ? Codegen.empty() : this.requireAdminApproval;
    }

    /**
     * Whether the device needs to be corp owned.
     * 
     */
    @Import(name="requireCorpOwned")
      private final @Nullable Output<Boolean> requireCorpOwned;

    public Output<Boolean> getRequireCorpOwned() {
        return this.requireCorpOwned == null ? Codegen.empty() : this.requireCorpOwned;
    }

    /**
     * Whether or not screenlock is required for the DevicePolicy
     * to be true. Defaults to false.
     * 
     */
    @Import(name="requireScreenLock")
      private final @Nullable Output<Boolean> requireScreenLock;

    public Output<Boolean> getRequireScreenLock() {
        return this.requireScreenLock == null ? Codegen.empty() : this.requireScreenLock;
    }

    public AccessLevelConditionDevicePolicyGetArgs(
        @Nullable Output<List<String>> allowedDeviceManagementLevels,
        @Nullable Output<List<String>> allowedEncryptionStatuses,
        @Nullable Output<List<AccessLevelConditionDevicePolicyOsConstraintGetArgs>> osConstraints,
        @Nullable Output<Boolean> requireAdminApproval,
        @Nullable Output<Boolean> requireCorpOwned,
        @Nullable Output<Boolean> requireScreenLock) {
        this.allowedDeviceManagementLevels = allowedDeviceManagementLevels;
        this.allowedEncryptionStatuses = allowedEncryptionStatuses;
        this.osConstraints = osConstraints;
        this.requireAdminApproval = requireAdminApproval;
        this.requireCorpOwned = requireCorpOwned;
        this.requireScreenLock = requireScreenLock;
    }

    private AccessLevelConditionDevicePolicyGetArgs() {
        this.allowedDeviceManagementLevels = Codegen.empty();
        this.allowedEncryptionStatuses = Codegen.empty();
        this.osConstraints = Codegen.empty();
        this.requireAdminApproval = Codegen.empty();
        this.requireCorpOwned = Codegen.empty();
        this.requireScreenLock = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelConditionDevicePolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedDeviceManagementLevels;
        private @Nullable Output<List<String>> allowedEncryptionStatuses;
        private @Nullable Output<List<AccessLevelConditionDevicePolicyOsConstraintGetArgs>> osConstraints;
        private @Nullable Output<Boolean> requireAdminApproval;
        private @Nullable Output<Boolean> requireCorpOwned;
        private @Nullable Output<Boolean> requireScreenLock;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelConditionDevicePolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedDeviceManagementLevels = defaults.allowedDeviceManagementLevels;
    	      this.allowedEncryptionStatuses = defaults.allowedEncryptionStatuses;
    	      this.osConstraints = defaults.osConstraints;
    	      this.requireAdminApproval = defaults.requireAdminApproval;
    	      this.requireCorpOwned = defaults.requireCorpOwned;
    	      this.requireScreenLock = defaults.requireScreenLock;
        }

        public Builder allowedDeviceManagementLevels(@Nullable Output<List<String>> allowedDeviceManagementLevels) {
            this.allowedDeviceManagementLevels = allowedDeviceManagementLevels;
            return this;
        }
        public Builder allowedDeviceManagementLevels(@Nullable List<String> allowedDeviceManagementLevels) {
            this.allowedDeviceManagementLevels = Codegen.ofNullable(allowedDeviceManagementLevels);
            return this;
        }
        public Builder allowedDeviceManagementLevels(String... allowedDeviceManagementLevels) {
            return allowedDeviceManagementLevels(List.of(allowedDeviceManagementLevels));
        }
        public Builder allowedEncryptionStatuses(@Nullable Output<List<String>> allowedEncryptionStatuses) {
            this.allowedEncryptionStatuses = allowedEncryptionStatuses;
            return this;
        }
        public Builder allowedEncryptionStatuses(@Nullable List<String> allowedEncryptionStatuses) {
            this.allowedEncryptionStatuses = Codegen.ofNullable(allowedEncryptionStatuses);
            return this;
        }
        public Builder allowedEncryptionStatuses(String... allowedEncryptionStatuses) {
            return allowedEncryptionStatuses(List.of(allowedEncryptionStatuses));
        }
        public Builder osConstraints(@Nullable Output<List<AccessLevelConditionDevicePolicyOsConstraintGetArgs>> osConstraints) {
            this.osConstraints = osConstraints;
            return this;
        }
        public Builder osConstraints(@Nullable List<AccessLevelConditionDevicePolicyOsConstraintGetArgs> osConstraints) {
            this.osConstraints = Codegen.ofNullable(osConstraints);
            return this;
        }
        public Builder osConstraints(AccessLevelConditionDevicePolicyOsConstraintGetArgs... osConstraints) {
            return osConstraints(List.of(osConstraints));
        }
        public Builder requireAdminApproval(@Nullable Output<Boolean> requireAdminApproval) {
            this.requireAdminApproval = requireAdminApproval;
            return this;
        }
        public Builder requireAdminApproval(@Nullable Boolean requireAdminApproval) {
            this.requireAdminApproval = Codegen.ofNullable(requireAdminApproval);
            return this;
        }
        public Builder requireCorpOwned(@Nullable Output<Boolean> requireCorpOwned) {
            this.requireCorpOwned = requireCorpOwned;
            return this;
        }
        public Builder requireCorpOwned(@Nullable Boolean requireCorpOwned) {
            this.requireCorpOwned = Codegen.ofNullable(requireCorpOwned);
            return this;
        }
        public Builder requireScreenLock(@Nullable Output<Boolean> requireScreenLock) {
            this.requireScreenLock = requireScreenLock;
            return this;
        }
        public Builder requireScreenLock(@Nullable Boolean requireScreenLock) {
            this.requireScreenLock = Codegen.ofNullable(requireScreenLock);
            return this;
        }        public AccessLevelConditionDevicePolicyGetArgs build() {
            return new AccessLevelConditionDevicePolicyGetArgs(allowedDeviceManagementLevels, allowedEncryptionStatuses, osConstraints, requireAdminApproval, requireCorpOwned, requireScreenLock);
        }
    }
}
