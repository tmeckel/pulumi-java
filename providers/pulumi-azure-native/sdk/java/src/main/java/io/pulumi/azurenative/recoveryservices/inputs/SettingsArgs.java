// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Common settings field for backup management
 * 
 */
public final class SettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SettingsArgs Empty = new SettingsArgs();

    /**
     * Workload compression flag. This has been added so that 'isSqlCompression'
     * will be deprecated once clients upgrade to consider this flag.
     * 
     */
    @InputImport(name="isCompression")
      private final @Nullable Input<Boolean> isCompression;

    public Input<Boolean> getIsCompression() {
        return this.isCompression == null ? Input.empty() : this.isCompression;
    }

    /**
     * SQL compression flag
     * 
     */
    @InputImport(name="issqlcompression")
      private final @Nullable Input<Boolean> issqlcompression;

    public Input<Boolean> getIssqlcompression() {
        return this.issqlcompression == null ? Input.empty() : this.issqlcompression;
    }

    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
     */
    @InputImport(name="timeZone")
      private final @Nullable Input<String> timeZone;

    public Input<String> getTimeZone() {
        return this.timeZone == null ? Input.empty() : this.timeZone;
    }

    public SettingsArgs(
        @Nullable Input<Boolean> isCompression,
        @Nullable Input<Boolean> issqlcompression,
        @Nullable Input<String> timeZone) {
        this.isCompression = isCompression;
        this.issqlcompression = issqlcompression;
        this.timeZone = timeZone;
    }

    private SettingsArgs() {
        this.isCompression = Input.empty();
        this.issqlcompression = Input.empty();
        this.timeZone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isCompression;
        private @Nullable Input<Boolean> issqlcompression;
        private @Nullable Input<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(SettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCompression = defaults.isCompression;
    	      this.issqlcompression = defaults.issqlcompression;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder isCompression(@Nullable Input<Boolean> isCompression) {
            this.isCompression = isCompression;
            return this;
        }

        public Builder isCompression(@Nullable Boolean isCompression) {
            this.isCompression = Input.ofNullable(isCompression);
            return this;
        }

        public Builder issqlcompression(@Nullable Input<Boolean> issqlcompression) {
            this.issqlcompression = issqlcompression;
            return this;
        }

        public Builder issqlcompression(@Nullable Boolean issqlcompression) {
            this.issqlcompression = Input.ofNullable(issqlcompression);
            return this;
        }

        public Builder timeZone(@Nullable Input<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Input.ofNullable(timeZone);
            return this;
        }
        public SettingsArgs build() {
            return new SettingsArgs(isCompression, issqlcompression, timeZone);
        }
    }
}
