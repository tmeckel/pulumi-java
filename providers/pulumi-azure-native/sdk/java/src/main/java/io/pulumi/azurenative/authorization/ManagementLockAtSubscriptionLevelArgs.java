// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.authorization.enums.LockLevel;
import io.pulumi.azurenative.authorization.inputs.ManagementLockOwnerArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagementLockAtSubscriptionLevelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementLockAtSubscriptionLevelArgs Empty = new ManagementLockAtSubscriptionLevelArgs();

    /**
     * The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means authorized users can only read from a resource, but they can't modify or delete it.
     * 
     */
    @Import(name="level", required=true)
      private final Output<Either<String,LockLevel>> level;

    public Output<Either<String,LockLevel>> getLevel() {
        return this.level;
    }

    /**
     * The name of lock. The lock name can be a maximum of 260 characters. It cannot contain <, > %, &, :, \, ?, /, or any control characters.
     * 
     */
    @Import(name="lockName")
      private final @Nullable Output<String> lockName;

    public Output<String> getLockName() {
        return this.lockName == null ? Codegen.empty() : this.lockName;
    }

    /**
     * Notes about the lock. Maximum of 512 characters.
     * 
     */
    @Import(name="notes")
      private final @Nullable Output<String> notes;

    public Output<String> getNotes() {
        return this.notes == null ? Codegen.empty() : this.notes;
    }

    /**
     * The owners of the lock.
     * 
     */
    @Import(name="owners")
      private final @Nullable Output<List<ManagementLockOwnerArgs>> owners;

    public Output<List<ManagementLockOwnerArgs>> getOwners() {
        return this.owners == null ? Codegen.empty() : this.owners;
    }

    public ManagementLockAtSubscriptionLevelArgs(
        Output<Either<String,LockLevel>> level,
        @Nullable Output<String> lockName,
        @Nullable Output<String> notes,
        @Nullable Output<List<ManagementLockOwnerArgs>> owners) {
        this.level = Objects.requireNonNull(level, "expected parameter 'level' to be non-null");
        this.lockName = lockName;
        this.notes = notes;
        this.owners = owners;
    }

    private ManagementLockAtSubscriptionLevelArgs() {
        this.level = Codegen.empty();
        this.lockName = Codegen.empty();
        this.notes = Codegen.empty();
        this.owners = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementLockAtSubscriptionLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,LockLevel>> level;
        private @Nullable Output<String> lockName;
        private @Nullable Output<String> notes;
        private @Nullable Output<List<ManagementLockOwnerArgs>> owners;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementLockAtSubscriptionLevelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
    	      this.lockName = defaults.lockName;
    	      this.notes = defaults.notes;
    	      this.owners = defaults.owners;
        }

        public Builder level(Output<Either<String,LockLevel>> level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }
        public Builder level(Either<String,LockLevel> level) {
            this.level = Output.of(Objects.requireNonNull(level));
            return this;
        }
        public Builder lockName(@Nullable Output<String> lockName) {
            this.lockName = lockName;
            return this;
        }
        public Builder lockName(@Nullable String lockName) {
            this.lockName = Codegen.ofNullable(lockName);
            return this;
        }
        public Builder notes(@Nullable Output<String> notes) {
            this.notes = notes;
            return this;
        }
        public Builder notes(@Nullable String notes) {
            this.notes = Codegen.ofNullable(notes);
            return this;
        }
        public Builder owners(@Nullable Output<List<ManagementLockOwnerArgs>> owners) {
            this.owners = owners;
            return this;
        }
        public Builder owners(@Nullable List<ManagementLockOwnerArgs> owners) {
            this.owners = Codegen.ofNullable(owners);
            return this;
        }
        public Builder owners(ManagementLockOwnerArgs... owners) {
            return owners(List.of(owners));
        }        public ManagementLockAtSubscriptionLevelArgs build() {
            return new ManagementLockAtSubscriptionLevelArgs(level, lockName, notes, owners);
        }
    }
}
