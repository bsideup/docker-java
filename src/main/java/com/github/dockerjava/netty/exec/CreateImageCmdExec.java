package com.github.dockerjava.netty.exec;

import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.WebTarget;

public class CreateImageCmdExec extends com.github.dockerjava.core.exec.CreateImageCmdExec {

    public CreateImageCmdExec(WebTarget baseResource, DockerClientConfig dockerClientConfig) {
        super(baseResource, dockerClientConfig);
    }
}