// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gameservices_v1beta.inputs.GkeClusterReferenceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The game server cluster connection information.
 * 
 */
public final class GameServerClusterConnectionInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerClusterConnectionInfoArgs Empty = new GameServerClusterConnectionInfoArgs();

    /**
     * Reference to the GKE cluster where the game servers are installed.
     * 
     */
    @InputImport(name="gkeClusterReference")
    private final @Nullable Input<GkeClusterReferenceArgs> gkeClusterReference;

    public Input<GkeClusterReferenceArgs> getGkeClusterReference() {
        return this.gkeClusterReference == null ? Input.empty() : this.gkeClusterReference;
    }

    /**
     * Namespace designated on the game server cluster where the Agones game server instances will be created. Existence of the namespace will be validated during creation.
     * 
     */
    @InputImport(name="namespace")
    private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    public GameServerClusterConnectionInfoArgs(
        @Nullable Input<GkeClusterReferenceArgs> gkeClusterReference,
        @Nullable Input<String> namespace) {
        this.gkeClusterReference = gkeClusterReference;
        this.namespace = namespace;
    }

    private GameServerClusterConnectionInfoArgs() {
        this.gkeClusterReference = Input.empty();
        this.namespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerClusterConnectionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GkeClusterReferenceArgs> gkeClusterReference;
        private @Nullable Input<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerClusterConnectionInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gkeClusterReference = defaults.gkeClusterReference;
    	      this.namespace = defaults.namespace;
        }

        public Builder setGkeClusterReference(@Nullable Input<GkeClusterReferenceArgs> gkeClusterReference) {
            this.gkeClusterReference = gkeClusterReference;
            return this;
        }

        public Builder setGkeClusterReference(@Nullable GkeClusterReferenceArgs gkeClusterReference) {
            this.gkeClusterReference = Input.ofNullable(gkeClusterReference);
            return this;
        }

        public Builder setNamespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public GameServerClusterConnectionInfoArgs build() {
            return new GameServerClusterConnectionInfoArgs(gkeClusterReference, namespace);
        }
    }
}
