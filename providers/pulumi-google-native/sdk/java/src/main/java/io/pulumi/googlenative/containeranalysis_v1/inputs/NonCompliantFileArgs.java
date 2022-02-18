// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details about files that caused a compliance check to fail.
 * 
 */
public final class NonCompliantFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final NonCompliantFileArgs Empty = new NonCompliantFileArgs();

    /**
     * Command to display the non-compliant files.
     * 
     */
    @InputImport(name="displayCommand")
    private final @Nullable Input<String> displayCommand;

    public Input<String> getDisplayCommand() {
        return this.displayCommand == null ? Input.empty() : this.displayCommand;
    }

    /**
     * display_command is a single command that can be used to display a list of non compliant files. When there is no such command, we can also iterate a list of non compliant file using 'path'. Empty if `display_command` is set.
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * Explains why a file is non compliant for a CIS check.
     * 
     */
    @InputImport(name="reason")
    private final @Nullable Input<String> reason;

    public Input<String> getReason() {
        return this.reason == null ? Input.empty() : this.reason;
    }

    public NonCompliantFileArgs(
        @Nullable Input<String> displayCommand,
        @Nullable Input<String> path,
        @Nullable Input<String> reason) {
        this.displayCommand = displayCommand;
        this.path = path;
        this.reason = reason;
    }

    private NonCompliantFileArgs() {
        this.displayCommand = Input.empty();
        this.path = Input.empty();
        this.reason = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonCompliantFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayCommand;
        private @Nullable Input<String> path;
        private @Nullable Input<String> reason;

        public Builder() {
    	      // Empty
        }

        public Builder(NonCompliantFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayCommand = defaults.displayCommand;
    	      this.path = defaults.path;
    	      this.reason = defaults.reason;
        }

        public Builder setDisplayCommand(@Nullable Input<String> displayCommand) {
            this.displayCommand = displayCommand;
            return this;
        }

        public Builder setDisplayCommand(@Nullable String displayCommand) {
            this.displayCommand = Input.ofNullable(displayCommand);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setReason(@Nullable Input<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = Input.ofNullable(reason);
            return this;
        }

        public NonCompliantFileArgs build() {
            return new NonCompliantFileArgs(displayCommand, path, reason);
        }
    }
}
