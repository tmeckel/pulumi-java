// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The protection mode of the collection/file types. Exe/Msi/Script are used for Windows, Executable is used for Linux.
 * 
 */
public final class ProtectionModeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProtectionModeArgs Empty = new ProtectionModeArgs();

    /**
     * The application control policy enforcement/protection mode of the machine group
     * 
     */
    @InputImport(name="exe")
      private final @Nullable Input<String> exe;

    public Input<String> getExe() {
        return this.exe == null ? Input.empty() : this.exe;
    }

    /**
     * The application control policy enforcement/protection mode of the machine group
     * 
     */
    @InputImport(name="executable")
      private final @Nullable Input<String> executable;

    public Input<String> getExecutable() {
        return this.executable == null ? Input.empty() : this.executable;
    }

    /**
     * The application control policy enforcement/protection mode of the machine group
     * 
     */
    @InputImport(name="msi")
      private final @Nullable Input<String> msi;

    public Input<String> getMsi() {
        return this.msi == null ? Input.empty() : this.msi;
    }

    /**
     * The application control policy enforcement/protection mode of the machine group
     * 
     */
    @InputImport(name="script")
      private final @Nullable Input<String> script;

    public Input<String> getScript() {
        return this.script == null ? Input.empty() : this.script;
    }

    public ProtectionModeArgs(
        @Nullable Input<String> exe,
        @Nullable Input<String> executable,
        @Nullable Input<String> msi,
        @Nullable Input<String> script) {
        this.exe = exe;
        this.executable = executable;
        this.msi = msi;
        this.script = script;
    }

    private ProtectionModeArgs() {
        this.exe = Input.empty();
        this.executable = Input.empty();
        this.msi = Input.empty();
        this.script = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtectionModeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> exe;
        private @Nullable Input<String> executable;
        private @Nullable Input<String> msi;
        private @Nullable Input<String> script;

        public Builder() {
    	      // Empty
        }

        public Builder(ProtectionModeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exe = defaults.exe;
    	      this.executable = defaults.executable;
    	      this.msi = defaults.msi;
    	      this.script = defaults.script;
        }

        public Builder exe(@Nullable Input<String> exe) {
            this.exe = exe;
            return this;
        }

        public Builder exe(@Nullable String exe) {
            this.exe = Input.ofNullable(exe);
            return this;
        }

        public Builder executable(@Nullable Input<String> executable) {
            this.executable = executable;
            return this;
        }

        public Builder executable(@Nullable String executable) {
            this.executable = Input.ofNullable(executable);
            return this;
        }

        public Builder msi(@Nullable Input<String> msi) {
            this.msi = msi;
            return this;
        }

        public Builder msi(@Nullable String msi) {
            this.msi = Input.ofNullable(msi);
            return this;
        }

        public Builder script(@Nullable Input<String> script) {
            this.script = script;
            return this;
        }

        public Builder script(@Nullable String script) {
            this.script = Input.ofNullable(script);
            return this;
        }
        public ProtectionModeArgs build() {
            return new ProtectionModeArgs(exe, executable, msi, script);
        }
    }
}
