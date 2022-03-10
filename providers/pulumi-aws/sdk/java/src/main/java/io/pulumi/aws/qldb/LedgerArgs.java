// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.qldb;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LedgerArgs extends io.pulumi.resources.ResourceArgs {

    public static final LedgerArgs Empty = new LedgerArgs();

    /**
     * The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via this provider, this value must be configured to `false` and applied first before attempting deletion.
     * 
     */
    @InputImport(name="deletionProtection")
      private final @Nullable Input<Boolean> deletionProtection;

    public Input<Boolean> getDeletionProtection() {
        return this.deletionProtection == null ? Input.empty() : this.deletionProtection;
    }

    /**
     * The friendly name for the QLDB Ledger instance. By default generated by this provider.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The permissions mode for the QLDB ledger instance. Specify either `ALLOW_ALL` or `STANDARD`.
     * 
     */
    @InputImport(name="permissionsMode", required=true)
      private final Input<String> permissionsMode;

    public Input<String> getPermissionsMode() {
        return this.permissionsMode;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LedgerArgs(
        @Nullable Input<Boolean> deletionProtection,
        @Nullable Input<String> name,
        Input<String> permissionsMode,
        @Nullable Input<Map<String,String>> tags) {
        this.deletionProtection = deletionProtection;
        this.name = name;
        this.permissionsMode = Objects.requireNonNull(permissionsMode, "expected parameter 'permissionsMode' to be non-null");
        this.tags = tags;
    }

    private LedgerArgs() {
        this.deletionProtection = Input.empty();
        this.name = Input.empty();
        this.permissionsMode = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LedgerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> deletionProtection;
        private @Nullable Input<String> name;
        private Input<String> permissionsMode;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LedgerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.name = defaults.name;
    	      this.permissionsMode = defaults.permissionsMode;
    	      this.tags = defaults.tags;
        }

        public Builder deletionProtection(@Nullable Input<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        public Builder deletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Input.ofNullable(deletionProtection);
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

        public Builder permissionsMode(Input<String> permissionsMode) {
            this.permissionsMode = Objects.requireNonNull(permissionsMode);
            return this;
        }

        public Builder permissionsMode(String permissionsMode) {
            this.permissionsMode = Input.of(Objects.requireNonNull(permissionsMode));
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public LedgerArgs build() {
            return new LedgerArgs(deletionProtection, name, permissionsMode, tags);
        }
    }
}
