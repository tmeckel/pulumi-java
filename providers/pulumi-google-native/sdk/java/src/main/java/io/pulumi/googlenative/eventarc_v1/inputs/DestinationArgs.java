// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.eventarc_v1.inputs.CloudRunArgs;
import io.pulumi.googlenative.eventarc_v1.inputs.GKEArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a target of an invocation over HTTP.
 * 
 */
public final class DestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DestinationArgs Empty = new DestinationArgs();

    /**
     * The Cloud Function resource name. Only Cloud Functions V2 is supported. Format: projects/{project}/locations/{location}/functions/{function}
     * 
     */
    @InputImport(name="cloudFunction")
      private final @Nullable Input<String> cloudFunction;

    public Input<String> getCloudFunction() {
        return this.cloudFunction == null ? Input.empty() : this.cloudFunction;
    }

    /**
     * Cloud Run fully-managed resource that receives the events. The resource should be in the same project as the trigger.
     * 
     */
    @InputImport(name="cloudRun")
      private final @Nullable Input<CloudRunArgs> cloudRun;

    public Input<CloudRunArgs> getCloudRun() {
        return this.cloudRun == null ? Input.empty() : this.cloudRun;
    }

    /**
     * A GKE service capable of receiving events. The service should be running in the same project as the trigger.
     * 
     */
    @InputImport(name="gke")
      private final @Nullable Input<GKEArgs> gke;

    public Input<GKEArgs> getGke() {
        return this.gke == null ? Input.empty() : this.gke;
    }

    public DestinationArgs(
        @Nullable Input<String> cloudFunction,
        @Nullable Input<CloudRunArgs> cloudRun,
        @Nullable Input<GKEArgs> gke) {
        this.cloudFunction = cloudFunction;
        this.cloudRun = cloudRun;
        this.gke = gke;
    }

    private DestinationArgs() {
        this.cloudFunction = Input.empty();
        this.cloudRun = Input.empty();
        this.gke = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudFunction;
        private @Nullable Input<CloudRunArgs> cloudRun;
        private @Nullable Input<GKEArgs> gke;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.cloudRun = defaults.cloudRun;
    	      this.gke = defaults.gke;
        }

        public Builder cloudFunction(@Nullable Input<String> cloudFunction) {
            this.cloudFunction = cloudFunction;
            return this;
        }

        public Builder cloudFunction(@Nullable String cloudFunction) {
            this.cloudFunction = Input.ofNullable(cloudFunction);
            return this;
        }

        public Builder cloudRun(@Nullable Input<CloudRunArgs> cloudRun) {
            this.cloudRun = cloudRun;
            return this;
        }

        public Builder cloudRun(@Nullable CloudRunArgs cloudRun) {
            this.cloudRun = Input.ofNullable(cloudRun);
            return this;
        }

        public Builder gke(@Nullable Input<GKEArgs> gke) {
            this.gke = gke;
            return this;
        }

        public Builder gke(@Nullable GKEArgs gke) {
            this.gke = Input.ofNullable(gke);
            return this;
        }
        public DestinationArgs build() {
            return new DestinationArgs(cloudFunction, cloudRun, gke);
        }
    }
}
