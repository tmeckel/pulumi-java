// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.inputs.SshProfileArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The ssh username, password, and ssh public key.
 * 
 */
public final class LinuxOperatingSystemProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinuxOperatingSystemProfileArgs Empty = new LinuxOperatingSystemProfileArgs();

    /**
     * The password.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The SSH profile.
     * 
     */
    @Import(name="sshProfile")
      private final @Nullable Output<SshProfileArgs> sshProfile;

    public Output<SshProfileArgs> getSshProfile() {
        return this.sshProfile == null ? Codegen.empty() : this.sshProfile;
    }

    /**
     * The username.
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> getUsername() {
        return this.username == null ? Codegen.empty() : this.username;
    }

    public LinuxOperatingSystemProfileArgs(
        @Nullable Output<String> password,
        @Nullable Output<SshProfileArgs> sshProfile,
        @Nullable Output<String> username) {
        this.password = password;
        this.sshProfile = sshProfile;
        this.username = username;
    }

    private LinuxOperatingSystemProfileArgs() {
        this.password = Codegen.empty();
        this.sshProfile = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxOperatingSystemProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> password;
        private @Nullable Output<SshProfileArgs> sshProfile;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxOperatingSystemProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.sshProfile = defaults.sshProfile;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder sshProfile(@Nullable Output<SshProfileArgs> sshProfile) {
            this.sshProfile = sshProfile;
            return this;
        }
        public Builder sshProfile(@Nullable SshProfileArgs sshProfile) {
            this.sshProfile = Codegen.ofNullable(sshProfile);
            return this;
        }
        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = Codegen.ofNullable(username);
            return this;
        }        public LinuxOperatingSystemProfileArgs build() {
            return new LinuxOperatingSystemProfileArgs(password, sshProfile, username);
        }
    }
}
