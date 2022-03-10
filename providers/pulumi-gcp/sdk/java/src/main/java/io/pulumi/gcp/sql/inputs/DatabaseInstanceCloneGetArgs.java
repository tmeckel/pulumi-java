// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceCloneGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceCloneGetArgs Empty = new DatabaseInstanceCloneGetArgs();

    /**
     * The timestamp of the point in time that should be restored.
     * 
     */
    @InputImport(name="pointInTime")
      private final @Nullable Input<String> pointInTime;

    public Input<String> getPointInTime() {
        return this.pointInTime == null ? Input.empty() : this.pointInTime;
    }

    /**
     * Name of the source instance which will be cloned.
     * 
     */
    @InputImport(name="sourceInstanceName", required=true)
      private final Input<String> sourceInstanceName;

    public Input<String> getSourceInstanceName() {
        return this.sourceInstanceName;
    }

    public DatabaseInstanceCloneGetArgs(
        @Nullable Input<String> pointInTime,
        Input<String> sourceInstanceName) {
        this.pointInTime = pointInTime;
        this.sourceInstanceName = Objects.requireNonNull(sourceInstanceName, "expected parameter 'sourceInstanceName' to be non-null");
    }

    private DatabaseInstanceCloneGetArgs() {
        this.pointInTime = Input.empty();
        this.sourceInstanceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceCloneGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> pointInTime;
        private Input<String> sourceInstanceName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceCloneGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pointInTime = defaults.pointInTime;
    	      this.sourceInstanceName = defaults.sourceInstanceName;
        }

        public Builder pointInTime(@Nullable Input<String> pointInTime) {
            this.pointInTime = pointInTime;
            return this;
        }

        public Builder pointInTime(@Nullable String pointInTime) {
            this.pointInTime = Input.ofNullable(pointInTime);
            return this;
        }

        public Builder sourceInstanceName(Input<String> sourceInstanceName) {
            this.sourceInstanceName = Objects.requireNonNull(sourceInstanceName);
            return this;
        }

        public Builder sourceInstanceName(String sourceInstanceName) {
            this.sourceInstanceName = Input.of(Objects.requireNonNull(sourceInstanceName));
            return this;
        }
        public DatabaseInstanceCloneGetArgs build() {
            return new DatabaseInstanceCloneGetArgs(pointInTime, sourceInstanceName);
        }
    }
}
