// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.LogLevel;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Application logs to file system configuration.
 * 
 */
public final class FileSystemApplicationLogsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileSystemApplicationLogsConfigArgs Empty = new FileSystemApplicationLogsConfigArgs();

    /**
     * Log level.
     * 
     */
    @InputImport(name="level")
      private final @Nullable Input<LogLevel> level;

    public Input<LogLevel> getLevel() {
        return this.level == null ? Input.empty() : this.level;
    }

    public FileSystemApplicationLogsConfigArgs(@Nullable Input<LogLevel> level) {
        this.level = level == null ? Input.ofNullable(io.pulumi.azurenative.web.enums.LogLevel.Off) : level;
    }

    private FileSystemApplicationLogsConfigArgs() {
        this.level = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemApplicationLogsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LogLevel> level;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemApplicationLogsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
        }

        public Builder level(@Nullable Input<LogLevel> level) {
            this.level = level;
            return this;
        }

        public Builder level(@Nullable LogLevel level) {
            this.level = Input.ofNullable(level);
            return this;
        }
        public FileSystemApplicationLogsConfigArgs build() {
            return new FileSystemApplicationLogsConfigArgs(level);
        }
    }
}
