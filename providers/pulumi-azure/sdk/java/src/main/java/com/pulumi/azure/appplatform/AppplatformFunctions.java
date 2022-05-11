// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appplatform.inputs.GetSpringCloudAppArgs;
import com.pulumi.azure.appplatform.inputs.GetSpringCloudServiceArgs;
import com.pulumi.azure.appplatform.outputs.GetSpringCloudAppResult;
import com.pulumi.azure.appplatform.outputs.GetSpringCloudServiceResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AppplatformFunctions {
    /**
     * Use this data source to access information about an existing Spring Cloud Application.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(AppplatformFunctions.getSpringCloudApp(GetSpringCloudAppArgs.builder()
     *             .name(azurerm_spring_cloud_app.getExample().getName())
     *             .resourceGroupName(azurerm_spring_cloud_app.getExample().getResource_group_name())
     *             .serviceName(azurerm_spring_cloud_app.getExample().getService_name())
     *             .build()));
     * 
     *         ctx.export(&#34;springCloudAppId&#34;, example.apply(getSpringCloudAppResult -&gt; getSpringCloudAppResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSpringCloudAppResult> getSpringCloudApp(GetSpringCloudAppArgs args) {
        return getSpringCloudApp(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Spring Cloud Application.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(AppplatformFunctions.getSpringCloudApp(GetSpringCloudAppArgs.builder()
     *             .name(azurerm_spring_cloud_app.getExample().getName())
     *             .resourceGroupName(azurerm_spring_cloud_app.getExample().getResource_group_name())
     *             .serviceName(azurerm_spring_cloud_app.getExample().getService_name())
     *             .build()));
     * 
     *         ctx.export(&#34;springCloudAppId&#34;, example.apply(getSpringCloudAppResult -&gt; getSpringCloudAppResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSpringCloudAppResult> getSpringCloudApp(GetSpringCloudAppArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:appplatform/getSpringCloudApp:getSpringCloudApp", TypeShape.of(GetSpringCloudAppResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Spring Cloud Service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(AppplatformFunctions.getSpringCloudService(GetSpringCloudServiceArgs.builder()
     *             .name(azurerm_spring_cloud_service.getExample().getName())
     *             .resourceGroupName(azurerm_spring_cloud_service.getExample().getResource_group_name())
     *             .build()));
     * 
     *         ctx.export(&#34;springCloudServiceId&#34;, example.apply(getSpringCloudServiceResult -&gt; getSpringCloudServiceResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSpringCloudServiceResult> getSpringCloudService(GetSpringCloudServiceArgs args) {
        return getSpringCloudService(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Spring Cloud Service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(AppplatformFunctions.getSpringCloudService(GetSpringCloudServiceArgs.builder()
     *             .name(azurerm_spring_cloud_service.getExample().getName())
     *             .resourceGroupName(azurerm_spring_cloud_service.getExample().getResource_group_name())
     *             .build()));
     * 
     *         ctx.export(&#34;springCloudServiceId&#34;, example.apply(getSpringCloudServiceResult -&gt; getSpringCloudServiceResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSpringCloudServiceResult> getSpringCloudService(GetSpringCloudServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:appplatform/getSpringCloudService:getSpringCloudService", TypeShape.of(GetSpringCloudServiceResult.class), args, Utilities.withVersion(options));
    }
}
