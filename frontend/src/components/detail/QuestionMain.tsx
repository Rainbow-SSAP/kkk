import React from 'react'
import Text from '@shared/Text'
import Flex from '@shared/Flex'
import Button from '@shared/Button'
import { Navigate, useNavigate } from 'react-router-dom'

export default function QuestionMain() {
  const navigate = useNavigate()

  const handleStartClick = () => {
    navigate('/detail')
  }

  return (
    <Flex align="center" justify="center" direction="column">
      <Text typography="t1" textAlign="center">
        AI 판사가 결정하는 <br /> 당신의 결혼식 축의금!
      </Text>
      <Button size="large" onClick={handleStartClick}>
        START!
      </Button>
    </Flex>
  )
}
